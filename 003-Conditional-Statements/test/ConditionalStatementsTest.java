import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ConditionalStatementsTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(EvenOrOdd.class, "2", "even"),
                arguments(EvenOrOdd.class, "3", "odd"),
                arguments(ExcellentGrade.class, "6", "Excellent!"),
                arguments(ExcellentGrade.class, "4", ""),
                arguments(GreaterNumber.class, "5\n3", "5"),
                arguments(GreaterNumber.class, "3\n5", "5"),
                arguments(NumberFromOneHundredToTwoHundred.class, "95", "Less than 100"),
                arguments(NumberFromOneHundredToTwoHundred.class, "120", "Between 100 and 200"),
                arguments(NumberFromOneHundredToTwoHundred.class, "210", "Greater than 200"),
                arguments(PasswordGuesser.class, "s3cr3t!P@ssw0rd", "Welcome"),
                arguments(PasswordGuesser.class, "qwerty", "Wrong password!"),
                arguments(ShapeFaces.class, "square\n5", "25.000"),
                arguments(ShapeFaces.class, "rectangle\n7\n2.5", "17.500"),
                arguments(ShapeFaces.class, "circle\n6", "113.097"),
                arguments(ShapeFaces.class, "triangle\n4.5\n20", "45.000"),
                arguments(SpeedInformation.class, "8", "slow"),
                arguments(SpeedInformation.class, "49.5", "average"),
                arguments(SpeedInformation.class, "126", "fast"),
                arguments(SpeedInformation.class, "160", "ultra fast"),
                arguments(SpeedInformation.class, "3500", "extremely fast"));
    }

    @ParameterizedTest(name = "{0} <- {1}")
    @MethodSource("cases")
    void printsExpectedOutput(Class<?> program, String input, String expected) {
        assertEquals(expected, ConsoleRunner.run(program, input));
    }
}
