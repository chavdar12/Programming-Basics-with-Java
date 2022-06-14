package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedLab.src;

import java.util.Scanner;

public class Exercise_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 100 || num > 200) {
            if (num != 0) {
                result = "invalid";
            }
        }
        System.out.println(result);
    }
}
