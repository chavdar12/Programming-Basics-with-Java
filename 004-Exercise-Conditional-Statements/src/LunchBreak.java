import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serial = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());
        double lunchTime = breakTime / 8.0;
        double restTime = breakTime / 4.0;
        double timeLeft = breakTime - lunchTime - restTime;
        if (timeLeft >= episode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(timeLeft - episode));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(episode - timeLeft));
        }
    }
}
