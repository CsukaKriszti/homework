import java.util.Scanner;

public class SquareNumberLister {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printSquareNumbers();
    }

    public static void printSquareNumbers() {
        int validNumber = requestNumberWithRetry();
        if (validNumber == -1) {
            System.out.println("You have attempted 5 times. I'm sorry, but the application has ended.");
        } else {
            for (int i = 0; i <= validNumber; i++) {
                if (isSquareNumber(i)) {
                    System.out.print(i + " ");
                }
            }
        }

    }

    public static int requestNumberWithRetry() {
        int count = 0;
        do {
            System.out.print("Please enter a number: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number >= 2 && number <= 2_000_000_000) {
                return number;
            }
            count++;
        } while (count < 5);
        return -1;
    }

    public static boolean isSquareNumber(int number) {
        return number > 0 && Math.sqrt(number) % 1 == 0;
    }
}
