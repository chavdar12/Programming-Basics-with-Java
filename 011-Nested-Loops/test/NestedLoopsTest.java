import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class NestedLoopsTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(Building.class, "6\n4", "L60 L61 L62 L63\nA50 A51 A52 A53\nO40 O41 O42 O43\nA30 A31 A32 A33\nO20 O21 O22 O23\nA10 A11 A12 A13"),
                arguments(Clock.class, "", IntStream.range(0, 24 * 60).mapToObj(m -> m / 60 + ":" + m % 60).collect(Collectors.joining("\n"))),
                arguments(Combinations.class, "25", "351"),
                arguments(Journey.class, "Greece\n1000\n200\n200\n300\n100\n150\n240\nSpain\n1200\n300\n500\n193\n423\nEnd", "Going to Greece!\nGoing to Spain!"),
                arguments(MultiplicationTable.class, "", IntStream.range(0, 100).mapToObj(k -> (k / 10 + 1) + " * " + (k % 10 + 1) + " = " + (k / 10 + 1) * (k % 10 + 1)).collect(Collectors.joining("\n"))),
                arguments(SumOfTwoNumbers.class, "1\n10\n5", "Combination N:4 (1 + 4 = 5)"),
                arguments(SumOfTwoNumbers.class, "88\n888\n1000", "Combination N:20025 (112 + 888 = 1000)"),
                arguments(SumOfTwoNumbers.class, "23\n24\n20", "4 combinations - neither equals 20"));
    }

    @ParameterizedTest(name = "{0} <- {1}")
    @MethodSource("cases")
    void printsExpectedOutput(Class<?> program, String input, String expected) {
        assertEquals(expected, ConsoleRunner.run(program, input));
    }
}
