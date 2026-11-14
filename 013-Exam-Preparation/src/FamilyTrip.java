import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int extraPercent = Integer.parseInt(scanner.nextLine());

        if (nights > 7) {
            pricePerNight *= 0.95;
        }
        double total = nights * pricePerNight + budget * extraPercent / 100;

        if (total <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.%n", budget - total);
        } else {
            System.out.printf("%.2f leva needed.%n", total - budget);
        }
    }
}
