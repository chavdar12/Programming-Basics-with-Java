package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise.src;

import java.util.Scanner;

public class Exercise_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double result;
        String operation = scanner.nextLine();
        switch (operation) {
            case "+":
                result = a + b;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", a, operation, b, result);
                } else {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", a, operation, b, result);
                }
                break;
            case "-":
                result = a - b;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", a, operation, b, result);
                } else {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", a, operation, b, result);
                }
                break;
            case "*":
                result = a * b;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", a, operation, b, result);
                } else {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", a, operation, b, result);
                }
                break;
            case "/":
                if (b == 0) {
                    System.out.printf("Cannot divide %.0f by zero", a);
                }else{
                        result = a / b;
                        System.out.printf("%.0f %s %.0f = %.2f", a, operation, b, result);
                    }
                break;
            case "%":
                if (b == 0) {
                    System.out.printf("Cannot divide %.0f by zero", a);
                }else {
                    result = a % b;
                    System.out.printf("%.0f %s %.0f = %.0f", a, operation, b, result);
                }
        }
    }
}
