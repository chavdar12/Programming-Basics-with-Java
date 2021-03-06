package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise.src;

import java.util.Scanner;

public class Exercise_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMin = Integer.parseInt(scanner.nextLine());
        int examTime = (examHour * 60) + examMinutes;
        int arriveTime = (arriveHour * 60) + arriveMin;
        int timeDiff = examTime - arriveTime;
        int hourDiff = Math.abs(timeDiff / 60);
        int minDiff = Math.abs(timeDiff % 60);
        if (timeDiff > 30) {
            System.out.println("Early");
            if (hourDiff != 0) {
                System.out.printf("%d:%02d hours before the start", hourDiff, minDiff);
            } else {
                System.out.printf("%d minutes before the start", minDiff);
            }
        } else if (timeDiff < 0) {
            System.out.println("Late");
            if (hourDiff != 0) {
                System.out.printf("%d:%02d hours after the start", hourDiff, minDiff);
            } else {
                System.out.printf("%d minutes after the start", minDiff);
            }
        } else if (timeDiff == 0) {
            System.out.println("On time");

        } else {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", minDiff);
        }
    }
}
