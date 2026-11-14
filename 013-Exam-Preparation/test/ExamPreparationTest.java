import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ExamPreparationTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(MovieProfit.class, "The Programmer\n20\n500\n7.50\n7", "The profit from the movie The Programmer is 69750.00 lv."),
                arguments(MovieProfit.class, "Python Basics\n40\n34785\n10.45\n14", "The profit from the movie Python Basics is 12504511.80 lv."),
                arguments(MovieProfit.class, "The Jungle\n22\n20500\n9.37\n30", "The profit from the movie The Jungle is 2958109.00 lv."),
                arguments(FamilyTrip.class, "800.50\n8\n100\n2", "Ivanovi will be left with 24.49 leva after vacation."),
                arguments(FamilyTrip.class, "500\n7\n66\n15", "37.00 leva needed."),
                arguments(RhythmicGymnastics.class, "Bulgaria\nribbon", "The team of Bulgaria get 19.000 on ribbon.\n5.00%"),
                arguments(RhythmicGymnastics.class, "Russia\nrope", "The team of Russia get 18.600 on rope.\n7.00%"),
                arguments(RhythmicGymnastics.class, "Italy\nhoop", "The team of Italy get 18.800 on hoop.\n6.00%"),
                arguments(MovieRatings.class, "5\nA Star is Born\n7.8\nCreed 2\n7.3\nMary Poppins\n7.2\nVice\n7.2\nCaptain Marvel\n7.1",
                        "A Star is Born is with highest rating: 7.8\nCaptain Marvel is with lowest rating: 7.1\nAverage rating: 7.3"),
                arguments(MovieRatings.class, "3\nInterstellar\n8.5\nDangal\n8.3\nGreen Book\n8.2",
                        "Interstellar is with highest rating: 8.5\nGreen Book is with lowest rating: 8.2\nAverage rating: 8.3"),
                arguments(TouristShop.class, "153.20\nBackpack\n25.20\nShoes\n54\nSunglasses\n30\nStop", "You bought 3 products for 94.20 leva."),
                arguments(TouristShop.class, "54\nThermal underwear\n24\nSunscreen\n45", "You don't have enough money!\nYou need 15.00 leva!"),
                arguments(VetParking.class, "2\n5", "Day: 1 - 5.50 leva\nDay: 2 - 9.50 leva\nTotal: 15.00 leva"),
                arguments(VetParking.class, "5\n2",
                        "Day: 1 - 2.25 leva\nDay: 2 - 3.50 leva\nDay: 3 - 2.25 leva\nDay: 4 - 3.50 leva\nDay: 5 - 2.25 leva\nTotal: 13.75 leva"));
    }

    @ParameterizedTest(name = "{0} <- {1}")
    @MethodSource("cases")
    void printsExpectedOutput(Class<?> program, String input, String expected) {
        assertEquals(expected, ConsoleRunner.run(program, input));
    }
}
