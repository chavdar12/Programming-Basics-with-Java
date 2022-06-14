package WhileLoop.WhileLoopMoreExercise.src;

import java.util.Scanner;

public class Exercise_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int cCounter = 0;
        boolean isCFound = false;
        int oCounter = 0;
        boolean isOFound = false;
        int nCounter = 0;
        boolean isNFound = false;
        boolean wordIsPrinted = false;
        while (!input.equals("End")) {
            char symbol = input.charAt(0);
            if (symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 122) {
                if (symbol == 99) {
                    if (cCounter == 0) {
                        cCounter++;
                        isCFound = true;
                    } else {
                        result.append(symbol);
                    }
                } else if (symbol == 110) {
                    if (nCounter == 0) {
                        nCounter++;
                        isNFound = true;
                    } else {
                        result.append(symbol);

                    }
                } else if (symbol == 111) {
                    if (oCounter == 0) {
                        isOFound = true;
                        oCounter++;

                    } else {
                        result.append(symbol);
                    }
                }
                if (isCFound && isNFound && isOFound) {
                    System.out.print(result + " ");
                    wordIsPrinted = true;

                }
            }
            if (wordIsPrinted) {
                nCounter = 0;
                cCounter = 0;
                oCounter = 0;
                isCFound = false;
                isNFound = false;
                isOFound = false;
                result = new StringBuilder();
            }
            input = scanner.nextLine();
        }
    }
}
