import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ExerciseFirstStepsInCodingTest {
    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(Aquarium.class, "85\n75\n47\n17", "248.689"),
                arguments(BasketballEquipment.class, "365", "811.76"),
                arguments(ConvertorFromRadiansToDegrees.class, "3.1416", "180"),
                arguments(ConvertorFromUsdToBgl.class, "22", "39.50"),
                arguments(DepositCalculator.class, "200\n3\n5.7", "202.85"),
                arguments(FoodDelivery.class, "2\n4\n3", "116.20"),
                arguments(Repainting.class, "10\n11\n4", "175.410"),
                arguments(StudyMaterials.class, "2\n3\n4", "34.200"));
    }

    @ParameterizedTest(name = "{0} <- {1}")
    @MethodSource("cases")
    void printsExpectedOutput(Class<?> program, String input, String expected) {
        assertEquals(expected, ConsoleRunner.run(program, input));
    }
}
