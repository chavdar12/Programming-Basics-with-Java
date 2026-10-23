import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FirstStepsInCodingTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(AreaOfRectangle.class, "5\n7", "35.0"),
                arguments(ConcatenateText.class, "Maria\nIvanova\n20\nSofia", "You are Maria Ivanova, a 20-years old person from Sofia."),
                arguments(ConvertorFromInchesToCentimeters.class, "5", "12.7"),
                arguments(GreetingByName.class, "Peter", "Hello, Peter!"),
                arguments(HelloSoftUni.class, "", "Hello SoftUni"),
                arguments(LandscapingOfYards.class, "550", "The final price is: 3432.11 lv.\nThe discount is: 753.39 lv."),
                arguments(NumbersFromOneToTen.class, "", IntStream.rangeClosed(1, 10).mapToObj(String::valueOf).collect(Collectors.joining("\n"))),
                arguments(PetShop.class, "5\n4", "28.50 lv."),
                arguments(PreparationOfProject.class, "George\n4", "The architect George will need 12 hours to complete 4 project/s."));
    }

    @ParameterizedTest(name = "{0} <- {1}")
    @MethodSource("cases")
    void printsExpectedOutput(Class<?> program, String input, String expected) {
        assertEquals(expected, ConsoleRunner.run(program, input));
    }
}
