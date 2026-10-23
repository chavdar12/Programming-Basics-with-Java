import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class WhileLoopsTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(ArrayOfNumbers.class, "31", "1\n3\n7\n15\n31"),
                arguments(Balance.class, "5.51\n69.42\n100\nNoMoreMoney", "Increase: 5.51\nIncrease: 69.42\nIncrease: 100.00\nTotal: 174.93"),
                arguments(Balance.class, "120\n45.55\n-150", "Increase: 120.00\nIncrease: 45.55\nInvalid operation!\nTotal: 165.55"),
                arguments(BiggestNumber.class, "3\n100\n99\n80", "100"),
                arguments(Graduation.class, "Gosho\n5\n5.5\n6\n5.43\n5.5\n6\n5.55\n5\n6\n6\n5.43\n5", "Gosho graduated. Average grade: 5.53"),
                arguments(Graduation.class, "Mimi\n5\n6\n5\n6\n5\n6\n6\n2\n3", "Mimi has been excluded at 8 grade"),
                arguments(Password.class, "Nakov\n1234\nPass\n1324\n1234", "Welcome Nakov!"),
                arguments(ReadWords.class, "Nakov\nSoftUni\nStop", "Nakov\nSoftUni"),
                arguments(SmallestNumber.class, "2\n-1\n-2", "-2"),
                arguments(SumOfNumbers.class, "100\n10\n20\n30\n40", "100"));
    }

    @ParameterizedTest(name = "{0} <- {1}")
    @MethodSource("cases")
    void printsExpectedOutput(Class<?> program, String input, String expected) {
        assertEquals(expected, ConsoleRunner.run(program, input));
    }
}
