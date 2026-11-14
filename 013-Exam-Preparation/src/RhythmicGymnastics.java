import java.util.Scanner;

public class RhythmicGymnastics {
    private static final double MAX_SCORE = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String apparatus = scanner.nextLine();

        // difficulty + performance
        double score = switch (country) {
            case "Russia" -> switch (apparatus) {
                case "ribbon" -> 9.100 + 9.400;
                case "hoop" -> 9.300 + 9.800;
                default -> 9.600 + 9.000;
            };
            case "Bulgaria" -> switch (apparatus) {
                case "ribbon" -> 9.600 + 9.400;
                case "hoop" -> 9.550 + 9.750;
                default -> 9.500 + 9.400;
            };
            default -> switch (apparatus) {
                case "ribbon" -> 9.200 + 9.500;
                case "hoop" -> 9.450 + 9.350;
                default -> 9.700 + 9.150;
            };
        };

        double missingPercent = (MAX_SCORE - score) / MAX_SCORE * 100;
        System.out.printf("The team of %s get %.3f on %s.%n", country, score, apparatus);
        System.out.printf("%.2f%%%n", missingPercent);
    }
}
