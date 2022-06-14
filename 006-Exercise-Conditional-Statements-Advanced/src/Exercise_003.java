package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise.src;

import java.util.Scanner;

public class Exercise_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String holiday = "";
        double price = 0.0;
        if (budget <= 100){
            holiday = "Bulgaria";
            switch (season) {
                case "summer" -> {
                    destination = "Camp";
                    price = 0.3 * budget;
                }
                case "winter" -> {
                    destination = "Hotel";
                    price = 0.7 * budget;
                }
            }
        }else if (budget <= 1000){
            holiday = "Balkans";
            switch (season) {
                case "summer" -> {
                    price = 0.4 * budget;
                    destination = "Camp";
                }
                case "winter" -> {
                    price = 0.8 * budget;
                    destination = "Hotel";
                }
            }
        }else {
            holiday = "Europe";
            price = 0.9 * budget;
            destination = "Hotel";
            }
        System.out.printf("Somewhere in %s%n", holiday);
        System.out.printf("%s - %.2f", destination, price);
    }
}
