package ConditionalStatements.ConditionalStatementsExercise.src;

import java.util.Scanner;

public class Exercise_005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());
        double puzzlePrice = puzzleCount * 2.60;
        double dollsPrice = dollsCount * 3;
        double bearsPrice = bearsCount * 4.10;
        double minionsPrice = minionsCount * 8.20;
        double truckPrice = trucksCount * 2;
        double allSum = puzzlePrice + dollsPrice + bearsPrice + minionsPrice + truckPrice;
        double allCount = puzzleCount + dollsCount + bearsCount + minionsCount + trucksCount;
        if (allCount >= 50) {
            allSum = allSum * 0.75;
        }
        allSum = allSum - (allSum * 0.1);

        if (allSum >= price) {
            double leftMoney = allSum - price;
            System.out.printf("Yes! %.2f lv left.", leftMoney);
        } else {
            double leftMoney = price - allSum;
            System.out.printf("Not enough money! %.2f lv needed.", leftMoney);
        }
    }
}
