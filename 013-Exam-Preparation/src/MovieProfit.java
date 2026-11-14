import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int cinemaPercent = Integer.parseInt(scanner.nextLine());

        double income = days * tickets * ticketPrice;
        double profit = income - income * cinemaPercent / 100;

        System.out.printf("The profit from the movie %s is %.2f lv.%n", movie, profit);
    }
}
