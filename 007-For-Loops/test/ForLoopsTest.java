import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ForLoopsTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(ArrayOfWholeNumbers.class, "5\n10\n20\n304\n0\n50", "Max number: 304\nMin number: 0"),
                arguments(EvenOddSum.class, "4\n10\n50\n60\n20", "Yes\nSum = 70"),
                arguments(EvenOddSum.class, "4\n3\n5\n1\n-2", "No\nDiff = 1"),
                arguments(EvenPowersOfTwo.class, "7", "1\n4\n16\n64"),
                arguments(LeftRightSum.class, "2\n10\n90\n60\n40", "Yes, sum = 100"),
                arguments(LeftRightSum.class, "2\n90\n9\n50\n50", "No, diff = 1"),
                arguments(NumberThroughThree.class, "10", "1\n4\n7\n10"),
                arguments(NumbersFromOneToOneHundred.class, "", IntStream.rangeClosed(1, 100).mapToObj(String::valueOf).collect(Collectors.joining("\n"))),
                arguments(NumbersInReverseOrder.class, "3", "3\n2\n1"),
                arguments(StreamOfCharacters.class, "abc", "a\nb\nc"),
                arguments(SumOfNumbers.class, "2\n10\n20", "30"),
                arguments(VowelSum.class, "hello", "6"),
                arguments(VowelSum.class, "bamboo", "9"));
    }

    @ParameterizedTest(name = "{0} <- {1}")
    @MethodSource("cases")
    void printsExpectedOutput(Class<?> program, String input, String expected) {
        assertEquals(expected, ConsoleRunner.run(program, input));
    }
}
