package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedLab.src;

import java.util.Scanner;

public class Exercise_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        switch (city) {
            case "Sofia":
                switch (product) {
                    case "coffee" -> price = 0.50;
                    case "water" -> price = 0.80;
                    case "beer" -> price = 1.20;
                    case "sweets" -> price = 1.45;
                    case "peanuts" -> price = 1.60;
                }
                break;
            case "Plovdiv":
                price = switch (product) {
                    case "coffee" -> 0.40;
                    case "water" -> 0.70;
                    case "beer" -> 1.15;
                    case "sweets" -> 1.30;
                    case "peanuts" -> 1.50;
                    default -> price;
                };
                break;
            case "Varna":
                price = switch (product) {
                    case "coffee" -> 0.45;
                    case "water" -> 0.70;
                    case "beer" -> 1.10;
                    case "sweets" -> 1.35;
                    case "peanuts" -> 1.55;
                    default -> price;
                };
                break;
        }
        price = price * quantity;
        System.out.println(price);
    }
}
