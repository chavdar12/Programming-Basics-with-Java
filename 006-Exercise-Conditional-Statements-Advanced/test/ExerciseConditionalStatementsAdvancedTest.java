import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ExerciseConditionalStatementsAdvancedTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(Cinema.class, "Premiere\n10\n12", "1440.00 leva"),
                arguments(Cinema.class, "Normal\n21\n13", "2047.50 leva"),
                arguments(Cinema.class, "Discount\n12\n30", "1800.00 leva"),
                arguments(FishingBoat.class, "3000\nSummer\n11", "Not enough money! You need 570.00 leva."),
                arguments(FishingBoat.class, "3600\nAutumn\n6", "Not enough money! You need 180.00 leva."),
                arguments(FishingBoat.class, "2000\nWinter\n13", "Yes! You have 50.00 leva left."),
                arguments(HotelRoom.class, "May\n15", "Apartment: 877.50 lv.\nStudio: 525.00 lv."),
                arguments(HotelRoom.class, "June\n14", "Apartment: 961.80 lv.\nStudio: 1052.80 lv."),
                arguments(HotelRoom.class, "August\n20", "Apartment: 1386.00 lv.\nStudio: 1520.00 lv."),
                arguments(Journey.class, "50\nsummer", "Somewhere in Bulgaria\nCamp - 15.00"),
                arguments(Journey.class, "75\nwinter", "Somewhere in Bulgaria\nHotel - 52.50"),
                arguments(Journey.class, "312\nsummer", "Somewhere in Balkans\nCamp - 124.80"),
                arguments(Journey.class, "1500\nsummer", "Somewhere in Europe\nHotel - 1350.00"),
                arguments(JustInTimeForAnExam.class, "9\n30\n9\n50", "Late\n20 minutes after the start"),
                arguments(JustInTimeForAnExam.class, "9\n0\n10\n30", "Late\n1:30 hours after the start"),
                arguments(JustInTimeForAnExam.class, "9\n0\n8\n30", "On time\n30 minutes before the start"),
                arguments(JustInTimeForAnExam.class, "10\n0\n10\n0", "On time"),
                arguments(JustInTimeForAnExam.class, "11\n30\n10\n55", "Early\n35 minutes before the start"),
                arguments(JustInTimeForAnExam.class, "11\n30\n8\n12", "Early\n3:18 hours before the start"),
                arguments(NewHome.class, "Roses\n55\n250", "Not enough money, you need 25.00 leva more."),
                arguments(NewHome.class, "Tulips\n88\n260", "Hey, you have a great garden with 88 Tulips and 50.56 leva left."),
                arguments(NewHome.class, "Narcissus\n119\n360", "Not enough money, you need 50.55 leva more."),
                arguments(NumberOperations.class, "10\n12\n+", "10 + 12 = 22 - even"),
                arguments(NumberOperations.class, "10\n1\n-", "10 - 1 = 9 - odd"),
                arguments(NumberOperations.class, "7\n3\n*", "7 * 3 = 21 - odd"),
                arguments(NumberOperations.class, "123\n12\n/", "123 / 12 = 10.25"),
                arguments(NumberOperations.class, "112\n0\n/", "Cannot divide 112 by zero"),
                arguments(NumberOperations.class, "10\n3\n%", "10 % 3 = 1"),
                arguments(SummerClothing.class, "16\nMorning", "It's 16 degrees, get your Sweatshirt and Sneakers."),
                arguments(SummerClothing.class, "22\nAfternoon", "It's 22 degrees, get your T-Shirt and Sandals."),
                arguments(SummerClothing.class, "28\nEvening", "It's 28 degrees, get your Shirt and Moccasins."));
    }

    @ParameterizedTest(name = "{0} <- {1}")
    @MethodSource("cases")
    void printsExpectedOutput(Class<?> program, String input, String expected) {
        assertEquals(expected, ConsoleRunner.run(program, input));
    }
}
