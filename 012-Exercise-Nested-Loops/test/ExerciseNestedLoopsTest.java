import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ExerciseNestedLoopsTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(CinemaTicket.class, "Taxi\n10\nstandard\nkid\nstudent\nstudent\nstandard\nstandard\nEnd\nScary Movie\n6\nstudent\nstudent\nstudent\nstudent\nstudent\nstudent\nFinish", "Taxi - 60.00% full.\nScary Movie - 100.00% full.\nTotal tickets: 12\n66.67% student tickets.\n25.00% standard tickets.\n8.33% kids tickets."),
                arguments(EqualSumsOfEvenAndOddPositions.class, "100000\n100050", "100001 100012 100023 100034 100045"),
                arguments(PyramidOfNumbers.class, "7", "1\n2 3\n4 5 6\n7"),
                arguments(SpecialNumbers.class, "3", "1111 1113 1131 1133 1311 1313 1331 1333 3111 3113 3131 3133 3311 3313 3331 3333"),
                arguments(SumOfPrimeAndNonePrimeNumbers.class, "3\n9\n0\n1\n7\n19\n4\nstop", "Sum of all prime numbers is: 29\nSum of all non prime numbers is: 14"),
                arguments(SumOfPrimeAndNonePrimeNumbers.class, "30\n83\n33\n-1\n20\nstop", "Number is negative.\nSum of all prime numbers is: 83\nSum of all non prime numbers is: 83"),
                arguments(TrainTheTrainers.class, "2\nWhile-Loop\n6.00\n5.50\nFor-Loop\n5.84\n5.66\nFinish", "While-Loop - 5.75.\nFor-Loop - 5.75.\nStudent's final assessment is 5.75."));
    }

    @ParameterizedTest(name = "{0} <- {1}")
    @MethodSource("cases")
    void printsExpectedOutput(Class<?> program, String input, String expected) {
        assertEquals(expected, ConsoleRunner.run(program, input));
    }
}
