import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double total = 0;
        for (int day = 1; day <= days; day++) {
            double dayTotal = 0;
            for (int hour = 1; hour <= hours; hour++) {
                if (day % 2 == 0 && hour % 2 == 1) {
                    dayTotal += 2.50;
                } else if (day % 2 == 1 && hour % 2 == 0) {
                    dayTotal += 1.25;
                } else {
                    dayTotal += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", day, dayTotal);
            total += dayTotal;
        }
        System.out.printf("Total: %.2f leva%n", total);
    }
}
