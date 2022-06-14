package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedLab.src;

import java.util.Scanner;

public class Exercise_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sell = Double.parseDouble(scanner.nextLine());
        double commission = 0.0;
        String result = "";
        if (sell >= 0 && sell <= 500) {
            switch (town) {
                case "Sofia" -> commission = 0.05 * sell;
                case "Varna" -> commission = 0.045 * sell;
                case "Plovdiv" -> commission = 0.055 * sell;
                default -> result = "error";
            }
        } else if (sell > 500 && sell <= 1000) {
            switch (town) {
                case "Sofia" -> commission = 0.07 * sell;
                case "Varna" -> commission = 0.075 * sell;
                case "Plovdiv" -> commission = 0.08 * sell;
                default -> result = "error";
            }
        } else if (sell > 1000 && sell <= 10000) {
            switch (town) {
                case "Sofia" -> commission = 0.08 * sell;
                case "Varna" -> commission = 0.1 * sell;
                case "Plovdiv" -> commission = 0.12 * sell;
                default -> result = "error";
            }
        } else {
            switch (town) {
                case "Sofia" -> commission = 0.12 * sell;
                case "Varna" -> commission = 0.13 * sell;
                case "Plovdiv" -> commission = 0.145 * sell;
                default -> result = "error";
            }
        }
        if (sell < 0 || result.equals("error")) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", commission);
        }
    }
}
