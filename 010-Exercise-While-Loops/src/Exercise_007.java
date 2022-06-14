package WhileLoop.WhileLoopMoreExercise.src;

import java.util.Scanner;

public class Exercise_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectedAmount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int i = 0;
        double cashMoney = 0;
        double cardMoney = 0;
        int cashCounter = 0;
        int cardCounter = 0;
        boolean goalReached = false;
        while (!input.equals("End")) {
            i++;
            int currentAmount = Integer.parseInt(input);
            if (i % 2 != 0) {
                if (currentAmount > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    cashMoney += currentAmount;
                    System.out.println("Product sold!");
                    cashCounter++;
                }
            } else {
                if (currentAmount < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    cardMoney += currentAmount;
                    System.out.println("Product sold!");
                    cardCounter++;
                }
            }
            double allMoney = cardMoney + cashMoney;
            if (allMoney >= expectedAmount) {
                goalReached = true;
                break;
            }
            input = scanner.nextLine();
        }
        double averageCash = cashMoney / cashCounter;
        double averageCard = cardMoney / cardCounter;

        if (goalReached) {
            System.out.printf("Average CS: %.2f%n", averageCash);
            System.out.printf("Average CC: %.2f%n", averageCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
