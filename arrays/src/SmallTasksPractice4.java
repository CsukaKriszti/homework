public class SmallTasksPractice4 {
    public static void main(String[] args) {
        printCustomFilteredFiveMultiples();
    }

    public static void printCustomFilteredFiveMultiples() {
        for (int i = 15003; i < 1416221; i++) {
            if (i % 5 == 0 && i % 10 != 0 && i % 3 != 0 && hasMoreThan12Divisors(i) && i > calculateEightFactorial()) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean hasMoreThan12Divisors(int number) {
        int counter = 0;
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                counter++;
                if (i != number / i) {
                    counter++;
                }
            }
            if (counter >= 12) {
                return true;
            }
        }
        return false;
    }

    private static long calculateEightFactorial() {
        long result = 1;
        for (int i = 2; i <= 8; i++) {
            result *= i;
        }
        return result;
    }
}