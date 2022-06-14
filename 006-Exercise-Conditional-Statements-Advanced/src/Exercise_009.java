package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise.src;

import java.util.Scanner;

public class Exercise_009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double volleyballTime = (48 - h) * 3.0 / 4;
        volleyballTime = volleyballTime + h + (2.0 / 3 * p);
        if (year.equals("leap")){
            volleyballTime *= 1.15;
        }
        volleyballTime = Math.floor(volleyballTime);
        System.out.printf("%.0f", volleyballTime);
    }
}
