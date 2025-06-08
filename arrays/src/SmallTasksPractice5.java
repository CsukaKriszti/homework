import java.util.Scanner;

public class SmallTasksPractice5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getNumberFromConsole();
    }

    public static void getNumberFromConsole() {
        System.out.println("Please enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number <= 2) {
            System.out.println("End of the program!");
            return;
        }
        int largestPrimeDivisor = calculateLargestPrimeDivisors(number);
        if (largestPrimeDivisor != -1) {
            int smallerPrime = findNextSmallerPrimeNumber(largestPrimeDivisor);
            int largerPrime = findNextLargerPrimeNumber(largestPrimeDivisor);
            System.out.println("The largest prime divisor: " + largestPrimeDivisor);
            if (smallerPrime != -1) {
                System.out.println("The closest smaller prime: " + smallerPrime);
            } else {
                System.out.println("No smaller prime found.");
            }
            System.out.println("The closest larger prime: " + largerPrime);
        } else {
            System.out.println("There are no prime numbers among the divisors of the number.");
        }
    }

    public static int calculateLargestPrimeDivisors(int number) {
        int largestPrime = -1;
        for (int i = 2; i * i <= number; i++) {
            while (number % i == 0) {
                if (isPrimeNumber(i)) {
                    largestPrime = i;
                }
                number /= i;
            }
        }
        return (largestPrime == number) ? -1 : largestPrime;
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findNextSmallerPrimeNumber(int number) {
        int smallerPrimeNumber = number - 1;
        while (smallerPrimeNumber > 1 && !isPrimeNumber(smallerPrimeNumber)) {
            smallerPrimeNumber--;
        }
        return (smallerPrimeNumber > 1) ? smallerPrimeNumber : -1;
    }

    public static int findNextLargerPrimeNumber(int number) {
        int nextPossiblePrime = number + 1;
        while (!isPrimeNumber(nextPossiblePrime)) {
            nextPossiblePrime++;

        }
        return nextPossiblePrime;
    }
}