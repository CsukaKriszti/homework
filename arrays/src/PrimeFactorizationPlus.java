import java.util.ArrayList;
import java.util.List;

public class PrimeFactorizationPlus {
    public static void main(String[] args) {
        System.out.println(getPrimeFactors(100));

    }

    public static List<Integer> getPrimeFactors(int number) {
        List<Integer> primeFactorialNumbers = new ArrayList<>();
        if (number > 1) {
            while (number % 2 == 0) {
                number /= 2;
                primeFactorialNumbers.add(2);
            }
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                while (number % i == 0) {
                    number /= i;
                    primeFactorialNumbers.add(i);
                }
            }
        }
        return primeFactorialNumbers;
    }
}