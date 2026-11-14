import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());

        int bought = 0;
        double spent = 0;
        String product = scanner.nextLine();

        while (!product.equals("Stop")) {
            double price = Double.parseDouble(scanner.nextLine());
            if ((bought + 1) % 3 == 0) {
                price /= 2; // every third product is half price
            }
            if (price > budget) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!%n", price - budget);
                return;
            }
            budget -= price;
            spent += price;
            bought++;
            product = scanner.nextLine();
        }

        System.out.printf("You bought %d products for %.2f leva.%n", bought, spent);
    }
}
