package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise.src;

import java.util.Scanner;

public class Exercise_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0.0;
        double apartmentPrice = 0.0;
        switch (month) {
            case "May", "October" -> {
                studioPrice = nights * 50;
                apartmentPrice = nights * 65;
                if (nights > 14) {
                    studioPrice *= 0.70;
                    apartmentPrice *= 0.90;
                } else if (nights > 7) {
                    studioPrice *= 0.95;
                }
            }
            case "June", "September" -> {
                studioPrice = nights * 75.20;
                apartmentPrice = nights * 68.70;
                if (nights > 14) {
                    studioPrice *= 0.80;
                    apartmentPrice *= 0.90;
                }
            }
            case "July", "August" -> {
                studioPrice = nights * 76;
                apartmentPrice = nights * 77;
                if (nights > 14) {
                    apartmentPrice *= 0.90;
                }
            }
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
