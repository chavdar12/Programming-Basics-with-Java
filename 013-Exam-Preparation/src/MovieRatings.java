import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        String highestName = "";
        String lowestName = "";
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        double sum = 0;

        for (int i = 0; i < count; i++) {
            String name = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            sum += rating;
            if (rating > highest) {
                highest = rating;
                highestName = name;
            }
            if (rating < lowest) {
                lowest = rating;
                lowestName = name;
            }
        }

        System.out.printf("%s is with highest rating: %.1f%n", highestName, highest);
        System.out.printf("%s is with lowest rating: %.1f%n", lowestName, lowest);
        System.out.printf("Average rating: %.1f%n", sum / count);
    }
}
