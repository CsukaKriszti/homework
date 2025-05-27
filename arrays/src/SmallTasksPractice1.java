public class SmallTasksPractice1 {
    public static void main(String[] args) {
        printPrimeNumbers();
        printPrimeCount();
    }

    public static void printPrimeCount() {
        System.out.println(countPrimes());
    }

    public static void printPrimeNumbers() {
        for (int i = 1000; i <= 2073; i++) {
            if (isPrimeNumber(i))
                System.out.println(i);
        }
    }

    public static int countPrimes() {
        int counter = 0;
        for (int i = 1000; i <= 2073; i++) {
            if (isPrimeNumber(i)) {
                counter++;
            }
        }
        return counter;
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