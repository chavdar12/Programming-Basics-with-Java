package WhileLoop.WhileLoopLab.src;

import java.util.Scanner;

public class Exercise_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumNum = 0;
        do {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sumNum += currentNum;
        } while (sumNum < n);
        System.out.println(sumNum);
    }
}
