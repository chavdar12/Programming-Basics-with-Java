package FirstStepsInCodingLab.src;

import java.util.Scanner;

public class Exercise_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double pricePerSquareMeter = 7.61;
        double Price = area * pricePerSquareMeter;
        double discount = Price * 0.18;
        double totalPrice = Price - discount;

        System.out.printf("The final price is: %.2f lv. %n", totalPrice);

        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
