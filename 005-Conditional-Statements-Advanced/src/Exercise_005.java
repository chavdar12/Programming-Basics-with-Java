package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedLab.src;

import java.util.Scanner;

public class Exercise_005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        switch (fruit) {
            case "banana":
                switch (day) {
                    case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> price = 2.50;
                    case "Saturday", "Sunday" -> price = 2.70;
                    default -> System.out.println("error");
                }
                break;
            case "apple":
                switch (day) {
                    case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> price = 1.20;
                    case "Saturday", "Sunday" -> price = 1.25;
                    default -> System.out.println("error");
                }
                break;
            case "orange":
                switch (day) {
                    case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> price = 0.85;
                    case "Saturday", "Sunday" -> price = 0.90;
                    default -> System.out.println("error");
                }
                break;
            case "grapefruit":
                switch (day) {
                    case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> price = 1.45;
                    case "Saturday", "Sunday" -> price = 1.60;
                    default -> System.out.println("error");
                }
                break;
            case "kiwi":
                switch (day) {
                    case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> price = 2.70;
                    case "Saturday", "Sunday" -> price = 3.00;
                    default -> System.out.println("error");
                }
                break;
            case "pineapple":
                switch (day) {
                    case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> price = 5.50;
                    case "Saturday", "Sunday" -> price = 5.60;
                    default -> System.out.println("error");
                }
                break;
            case "grapes":
                switch (day) {
                    case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> price = 3.85;
                    case "Saturday", "Sunday" -> price = 4.20;
                    default -> System.out.println("error");
                }
                break;
            default: {
                System.out.println("error");
            }
        }
        if (price != 0) {
            System.out.printf("%.2f", price * quantity);
        }
    }
}
