import java.util.Scanner;

public class PrimeLister {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printPrimeNumbers();

    }


    public static void printPrimeNumbers() {
        int validNumber = requestNumberWithRetry();
        scanner.close();
        if (validNumber == -1) {
            System.out.println("You have attempted 5 times. I'm sorry, but the application has ended.");
        } else {
            for (int i = 0; i <= validNumber; i++) {
                if (isPrimeNumber(i)) {
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
            if (number >= 2 && number <= 2_000_000_000)
                return number;
            count++;
        } while (count < 5);
        return -1;
    }

    public static boolean isPrimeNumber(int number) {

        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

