import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ExerciseConditionalStatementsTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(BonusPoints.class, "20", "6.0\n26.0"),
                arguments(BonusPoints.class, "175", "37.0\n212.0"),
                arguments(BonusPoints.class, "2703", "270.3\n2973.3"),
                arguments(GodzillaVsKong.class, "20000\n120\n55.5", "Action!\nWingard starts filming with 11340.00 leva left."),
                arguments(GodzillaVsKong.class, "9587.88\n222\n55.68", "Not enough money!\nWingard needs 2495.77 leva more."),
                arguments(LunchBreak.class, "Game of Thrones\n60\n96", "You have enough time to watch Game of Thrones and left with 0 minutes free time."),
                arguments(LunchBreak.class, "Teen Wolf\n48\n60", "You don't have enough time to watch Teen Wolf, you need 11 more minutes."),
                arguments(Shopping.class, "900\n2\n1\n3", "You have 336.88 leva left!"),
                arguments(Shopping.class, "100\n1\n1\n1", "Not enough money! You need 262.50 leva more!"),
                arguments(SumOfSeconds.class, "35\n45\n44", "2:04"),
                arguments(SumOfSeconds.class, "50\n50\n49", "2:29"),
                arguments(SwimmingWorldRecord.class, "10464\n1500\n20", "No, he failed! He was 20786.00 seconds slower."),
                arguments(SwimmingWorldRecord.class, "55555.67\n3017\n5.03", "Yes, he succeeded! The new world record is 17688.01 seconds."),
                arguments(TimePlusFifteenMinutes.class, "1\n46", "2:01"),
                arguments(TimePlusFifteenMinutes.class, "23\n59", "0:14"),
                arguments(TimePlusFifteenMinutes.class, "11\n08", "11:23"),
                arguments(ToyStore.class, "40.8\n20\n25\n30\n50\n10", "Yes! 418.20 lv left."),
                arguments(ToyStore.class, "320\n8\n2\n5\n5\n1", "Not enough money! 238.73 lv needed."));
    }

    @ParameterizedTest(name = "{0} <- {1}")
    @MethodSource("cases")
    void printsExpectedOutput(Class<?> program, String input, String expected) {
        assertEquals(expected, ConsoleRunner.run(program, input));
    }
}
