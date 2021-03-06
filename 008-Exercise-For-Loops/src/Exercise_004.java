package ForLoop.ForLoopExercise.src;

import java.util.Scanner;

public class Exercise_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        String result = "";
        for (int i = 1; i <= n; i++) {
            String website = scanner.nextLine();
            switch (website) {
                case "Facebook" -> salary = salary - 150;
                case "Instagram" -> salary = salary - 100;
                case "Reddit" -> salary = salary - 50;
            }
            if (salary <= 0) {
                result = "End";
                break;
            }
        }
        if (result.equals("End")) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
