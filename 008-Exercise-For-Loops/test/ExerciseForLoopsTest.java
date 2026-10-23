import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ExerciseForLoopsTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(ElementEqualToTheSumOfOthers.class, "7\n3\n4\n1\n1\n2\n12\n1", "Yes\nSum = 12"),
                arguments(ElementEqualToTheSumOfOthers.class, "3\n1\n1\n10", "No\nDiff = 8"),
                arguments(Histogram.class, "3\n1\n2\n999", "66.67%\n0.00%\n0.00%\n0.00%\n33.33%"),
                arguments(NumbersUpToOneThousandEndingInSeven.class, "", IntStream.rangeClosed(0, 99).map(i -> i * 10 + 7).mapToObj(String::valueOf).collect(Collectors.joining("\n"))),
                arguments(Oscars.class, "Zahari Baharov\n205\n4\nJohnny Depp\n45\nWill Smith\n29\nJet Lee\n10\nMatthew Mcconaughey\n39", "Sorry, Zahari Baharov you need 247.5 more!"),
                arguments(Oscars.class, "Sandra Bullock\n340\n5\nRobert De Niro\n50\nJulia Roberts\n40.5\nDaniel Day-Lewis\n39.4\nNicolas Cage\n29.9\nStoyanka Mutafova\n33", "Congratulations, Sandra Bullock got a nominee for leading role with 1268.5!"),
                arguments(Salary.class, "10\n750\nFacebook\nDev.bg\nInstagram\nFacebook\nReddit\nFacebook\nFacebook", "You have lost your salary."),
                arguments(Salary.class, "3\n500\nGithub\nFacebook\nReddit", "300"),
                arguments(SmartLily.class, "10\n170.00\n6", "Yes! 5.00"),
                arguments(SmartLily.class, "21\n1570.98\n3", "No! 997.98"),
                arguments(TrackingMania.class, "5\n25\n41\n31\n250\n6", "0.00%\n1.70%\n7.08%\n8.78%\n82.44%"),
                arguments(WorldTennisRankings.class, "3\n1000\nW\n10\nF\n0\nSF\n5", "Final points: 4935\nAverage points: 1645\n393.50%"));
    }

    @ParameterizedTest(name = "{0} <- {1}")
    @MethodSource("cases")
    void printsExpectedOutput(Class<?> program, String input, String expected) {
        assertEquals(expected, ConsoleRunner.run(program, input));
    }
}
