package ConditionalStatements.ConditionalStatementsLab.src;

import java.util.Scanner;

public class Exercise_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int greaterNumber = Math.max(firstNumber, secondNumber);
        System.out.println(greaterNumber);
    }
}

