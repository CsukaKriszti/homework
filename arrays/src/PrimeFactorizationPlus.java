import java.util.ArrayList;
import java.util.List;

public class PrimeFactorizationPlus {
    public static void main(String[] args) {
        System.out.println(getPrimeFactors(2_000_000_000));

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

    public static List<Integer> getPrimeFactors(int number) {
        List<Integer> primeFactorialNumbers = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if (isPrimeNumber(i)) {
                while (number % i == 0) {
                    number /= i;
                    primeFactorialNumbers.add(i);
                }
            }
        }
        return primeFactorialNumbers;
    }
}