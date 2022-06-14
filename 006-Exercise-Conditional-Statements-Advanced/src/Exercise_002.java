package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise.src;

import java.util.Scanner;

public class Exercise_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        double price = switch (season) {
            case "Spring" -> 3000;
            case "Summer", "Autumn" -> 4200;
            case "Winter" -> 2600;
            default -> 0.0;
        };
        if (fishers <= 6) {
            price *= 0.90;
        } else if (fishers <= 11) {
            price *= 0.85;
        } else {
            price *= 0.75;
        }
        if (fishers % 2 == 0 && !season.equals("Autumn"))
        {
            price *= 0.95;
        }
        double money = Math.abs(budget - price);
        if (budget >= price){
            System.out.printf("Yes! You have %.2f leva left.", money);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", money);
        }
    }
}
