import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeListerTests {
    @Test
    void isPrimeNumberZero() {
        int number = 0;
        boolean result = PrimeLister.isPrimeNumber(number);
        Assertions.assertFalse(result);
    }

    @Test
    void isPrimeNumber1() {
        int number = 1;
        boolean result = PrimeLister.isPrimeNumber(number);
        Assertions.assertFalse(result);
    }

    @Test
    void isPrimeNumber2() {
        int number = 2;
        boolean result = PrimeLister.isPrimeNumber(number);
        Assertions.assertTrue(result);
    }

    @Test
    void isPrimeNumber3() {
        int number = 3;
        boolean result = PrimeLister.isPrimeNumber(number);
        Assertions.assertTrue(result);
    }

    @Test
    void isPrimeNumber4() {
        int number = 4;
        boolean result = PrimeLister.isPrimeNumber(number);
        Assertions.assertFalse(result);
    }

    @Test
    void isPrimeNumber2_000_000_000() {
        int number = 2_000_000_000;
        boolean result = PrimeLister.isPrimeNumber(number);
        Assertions.assertFalse(result);

    }

    @Test
    void isPrimeForOutOfRangeNumberShouldReturnTrue() {
        int number = 2_000_000_033;
        boolean result = PrimeLister.isPrimeNumber(number);
        Assertions.assertTrue(result);

    }


}