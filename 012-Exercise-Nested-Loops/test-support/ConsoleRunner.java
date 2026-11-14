import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.stream.Collectors;

/** Runs a console program's main with the given stdin and returns its stdout, trailing spaces trimmed per line. */
public final class ConsoleRunner {
    private ConsoleRunner() {
    }

    public static String run(Class<?> program, String input) {
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        Locale originalLocale = Locale.getDefault();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            // printf("%.2f") is locale-sensitive; expected outputs use a dot
            Locale.setDefault(Locale.US);
            System.setIn(new ByteArrayInputStream((input + "\n").getBytes(StandardCharsets.UTF_8)));
            System.setOut(new PrintStream(out, true, StandardCharsets.UTF_8));
            program.getMethod("main", String[].class).invoke(null, (Object) new String[0]);
        } catch (InvocationTargetException e) {
            throw new AssertionError(program.getSimpleName() + " threw", e.getCause());
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(e);
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
            Locale.setDefault(originalLocale);
        }
        return out.toString(StandardCharsets.UTF_8).lines()
                .map(String::stripTrailing)
                .collect(Collectors.joining("\n"))
                .strip();
    }
}
