import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
    public static void main(String[] args) {
        int number = 100;
        System.out.println(getPrimeFactors(number));
    }

    public static List<Boolean> createBooleanListWithTrue(int number) {
        List<Boolean> primes = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            primes.add(true);
        }
        primes.set(0, false);
        primes.set(1, false);
        return primes;
    }

    public static List<Boolean> createPrimeBooleanList(int number) {
        List<Boolean> primes = createBooleanListWithTrue(number);
        for (int i = 2; i * i < number; i++) {
            if (primes.get(i)) {
                for (int j = i * i; j < number; j += i) {
                    primes.set(j, false);
                }
            }
        }
        return primes;
    }

    public static List<Integer> createPrimeList(List<Boolean> primes) {
        List<Integer> primeList = new ArrayList<>();
        int index = 0;
        for (int i = 2; i < primes.size(); i++) {
            if (primes.get(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    public static List<Integer> getPrimeFactors(int number) {
        List<Boolean> booleanPrimeList = createPrimeBooleanList(number);
        List<Integer> primeList = createPrimeList(booleanPrimeList);
        List<Integer> primeFactorialNumbers = new ArrayList<>();
        for (int prime : primeList) {
            while (number % prime == 0) {
                number /= prime;
                primeFactorialNumbers.add(prime);
            }

        }
        return primeFactorialNumbers;
    }
}