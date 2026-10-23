import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ConditionalStatementsAdvancedTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(AddressByAgeAndGender.class, "12\nf", "Miss"),
                arguments(AddressByAgeAndGender.class, "17\nm", "Mr."),
                arguments(AddressByAgeAndGender.class, "25\nf", "Ms."),
                arguments(AddressByAgeAndGender.class, "13.5\nm", "Master"),
                arguments(AnimalClass.class, "dog", "mammal"),
                arguments(AnimalClass.class, "snake", "reptile"),
                arguments(AnimalClass.class, "cat", "unknown"),
                arguments(CinemaTicket.class, "Monday", "12"),
                arguments(CinemaTicket.class, "Wednesday", "14"),
                arguments(CinemaTicket.class, "Sunday", "16"),
                arguments(DayOffOrWorkingDay.class, "Monday", "Working day"),
                arguments(DayOffOrWorkingDay.class, "Sunday", "Weekend"),
                arguments(DayOffOrWorkingDay.class, "Holiday", "Error"),
                arguments(Exercise_009.class, "14\napartment\npositive", "264.06"),
                arguments(Exercise_009.class, "30\npresident apartment\nnegative", "730.80"),
                arguments(Exercise_009.class, "12\nroom for one person\npositive", "247.50"),
                arguments(FruitOrVegetable.class, "banana", "fruit"),
                arguments(FruitOrVegetable.class, "tomato", "vegetable"),
                arguments(FruitOrVegetable.class, "java", "unknown"),
                arguments(FruitShop.class, "apple\nTuesday\n2", "2.40"),
                arguments(FruitShop.class, "orange\nSunday\n3", "2.70"),
                arguments(FruitShop.class, "tomato\nMonday\n0.5", "error"),
                arguments(InvalidNumber.class, "75", "invalid"),
                arguments(InvalidNumber.class, "150", ""),
                arguments(InvalidNumber.class, "0", ""),
                arguments(InvalidNumber.class, "220", "invalid"),
                arguments(NeighborhoodShop.class, "coffee\nVarna\n2", "0.9"),
                arguments(NeighborhoodShop.class, "water\nSofia\n2", "1.6"),
                arguments(NeighborhoodShop.class, "peanuts\nPlovdiv\n1", "1.5"),
                arguments(NumberInInterval.class, "-25", "Yes"),
                arguments(NumberInInterval.class, "0", "No"),
                arguments(NumberInInterval.class, "101", "No"),
                arguments(TradeCommissions.class, "Sofia\n1500", "120.00"),
                arguments(TradeCommissions.class, "Plovdiv\n499.99", "27.50"),
                arguments(TradeCommissions.class, "Kaspichan\n-50", "error"),
                arguments(WeekDay.class, "2", "Tuesday"),
                arguments(WeekDay.class, "7", "Sunday"),
                arguments(WeekDay.class, "-1", "Error"),
                arguments(WorkDay.class, "11\nMonday", "open"),
                arguments(WorkDay.class, "19\nFriday", "closed"),
                arguments(WorkDay.class, "11\nSunday", "closed"));
    }

    @ParameterizedTest(name = "{0} <- {1}")
    @MethodSource("cases")
    void printsExpectedOutput(Class<?> program, String input, String expected) {
        assertEquals(expected, ConsoleRunner.run(program, input));
    }
}
