package WhileLoop.WhileLoopLab.src;

import java.util.Scanner;

public class Exercise_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int maxNum = Integer.MIN_VALUE;
        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (number > maxNum) {
                maxNum = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(maxNum);
    }
}
