package ForLoop.ForLoopExercise.src;

import java.util.Scanner;

public class Exercise_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        double startingPoints = Double.parseDouble(scanner.nextLine());
        double averageScore = 0.0;
        double winCounter = 0;
        double points = startingPoints;
        for (int i = 1; i <= tournamentsCount; i++) {
            String position = scanner.nextLine();
            switch (position) {
                case "W" -> {
                    points += 2000;
                    averageScore += 2000;
                    winCounter++;
                }
                case "F" -> {
                    points += 1200;
                    averageScore += 1200;
                }
                case "SF" -> {
                    points += 720;
                    averageScore += 720;
                }
            }
        }
        averageScore = averageScore / tournamentsCount;
        double winPer = (winCounter * 100) / tournamentsCount;
        System.out.printf("Final points: %.0f%n", points);
        System.out.printf("Average points: %.0f%n", Math.floor(averageScore));
        System.out.printf("%.2f%%", winPer);
    }
}
