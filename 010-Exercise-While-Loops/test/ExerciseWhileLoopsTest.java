import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ExerciseWhileLoopsTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(Cake.class, "10\n10\n20\n20\n20\n20\n21", "No more cake left! You need 1 pieces more."),
                arguments(Cake.class, "10\n2\n2\n4\n6\nSTOP", "8 pieces are left."),
                arguments(Coins.class, "1.23", "4"),
                arguments(Coins.class, "2", "1"),
                arguments(Coins.class, "0.56", "3"),
                arguments(Coins.class, "2.73", "5"),
                arguments(ExamPreparation.class, "3\nMoney\n6\nStory\n4\nSpring Time\n5\nBus\n6\nEnough", "Average score: 5.25\nNumber of problems: 4\nLast problem: Bus"),
                arguments(ExamPreparation.class, "2\nIncome\n3\nGame Info\n6\nBest Player\n4", "You need a break, 2 poor grades."),
                arguments(Moving.class, "10\n10\n2\n20\n20\n20\n20\n122", "No more free space! You need 2 Cubic meters more."),
                arguments(Moving.class, "10\n1\n2\n4\n6\nDone", "10 Cubic meters left."),
                arguments(OldLibrary.class, "Troy\n8\nStronger\nLife Style\nTroy", "You checked 2 books and found it."),
                arguments(OldLibrary.class, "Bourne\n3\nTrue Story\nForever\nMore Space", "The book you search is not here!\nYou checked 3 books."),
                arguments(Rest.class, "2000\n1000\nspend\n1200\nsave\n2000", "You saved the money for 2 days."),
                arguments(Rest.class, "110\n60\nspend\n10\nspend\n10\nspend\n10\nspend\n10\nspend\n10", "You can't save the money.\n5"),
                arguments(Steps.class, "1000\n1500\n2000\n6500", "Goal reached! Good job!"),
                arguments(Steps.class, "1500\n300\n2500\n3000\nGoing home\n200", "2500 more steps to reach goal."));
    }

    @ParameterizedTest(name = "{0} <- {1}")
    @MethodSource("cases")
    void printsExpectedOutput(Class<?> program, String input, String expected) {
        assertEquals(expected, ConsoleRunner.run(program, input));
    }
}
