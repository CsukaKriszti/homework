public class SieveOfEratosthenes {
    public static void main(String[] args) {


        boolean[] primes = new boolean[1000];

        for (int i = 0; i < 1000; i++) {
            primes[i] = true;
        }
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i < 1000; i++) {
            if (primes[i]) {
                for (int j = i * i; j < 1000; j += i) {
                    primes[j] = false;
                }
            }
        }
    }
}