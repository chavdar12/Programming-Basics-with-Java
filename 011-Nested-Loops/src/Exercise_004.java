package NestedLoops.NestedLoopsLab.src;

import java.util.Scanner;

public class Exercise_004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    int result = i + j + k;
                    if (result == n) {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
