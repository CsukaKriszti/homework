import java.util.ArrayList;
import java.util.List;

public class PrimeFactorizationPlus {
    public static void main(String[] args) {
        System.out.println("Fourth Attempt: "+getPrimeFactorsThirdAttempt(2_000_000_00));
        System.out.println("Third Attempt: "+getPrimeFactorsThirdAttempt(2_000_000_00));
        System.out.println("Second Attempt: "+getPrimeFactorsSecondAttempt(2_000_000_00));
        System.out.println("First Attempt: "+getPrimeFactorsFirstAttempt(2_000_000_00));

    }
    //-----------------------------------Fourth Attempt-------------------------------------------------
    public static List<Integer> getPrimeFactorsFourthAttempt(int number) {
        List<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }

        return primeFactors;
    }
    //-----------------------------------Third Attempt--------------------------------------------------
    public static List<Integer> getPrimeFactorsThirdAttempt(int number) {
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
    //----------------------------------Second Attempt--------------------------------------------------
    public static boolean isPrimeNumberSecondAttempt(int number) {
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

    public static List<Integer> getPrimeFactorsSecondAttempt(int number) {
        List<Integer> primeFactorialNumbers = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if (isPrimeNumberSecondAttempt(i)) {
                while (number % i == 0) {
                    number /= i;
                    primeFactorialNumbers.add(i);
                }
            }
        }
        return primeFactorialNumbers;
    }
    //-----------------------------------First Attempt--------------------------------------------------
    public static List<Boolean> createBooleanListWithTrueFirstAttempt(int number) {
        List<Boolean> primes = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            primes.add(true);
        }
        primes.set(0, false);
        primes.set(1, false);
        return primes;
    }

    public static List<Boolean> createPrimeBooleanListFirstAttempt(int number) {
        List<Boolean> primes = createBooleanListWithTrueFirstAttempt(number);
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
    public static List<Integer> getPrimeFactorsFirstAttempt(int number) {
        List<Boolean> booleanPrimeList = createPrimeBooleanListFirstAttempt(number);
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