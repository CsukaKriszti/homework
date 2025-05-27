import java.util.Scanner;

public class SmallTasksPractice2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getNumberWithMostDivisors();
        scanner.close();
    }

    public static void getNumberWithMostDivisors() {
        int number = returnNumberFromConsole();
        if (number == -1) {
            System.out.println("End of the program.");
            return;
        }
        int maxDivisor = 0;
        int result = 1;

        for (int i = 1; i <= number; i++) {
            int divisorCount = countDivisors(i);
            if (divisorCount > maxDivisor) {
                maxDivisor = divisorCount;
                result = i;
            }
        }
        System.out.println("The number with the most divisors: " + result);
    }

    public static int returnNumberFromConsole() {
        System.out.println("Please enter a number between 2 and 100000:");
        int number = scanner.nextInt();
        if (number < 2 || number > 100000) {
            return -1;
        }
        return number;
    }

    public static int countDivisors(int number) {
        int counter = 0;
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                counter += (i * i == number) ? 1 : 2;
            }
        }
        return counter;
    }
}