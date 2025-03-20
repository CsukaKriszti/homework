import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PrimeListerTests {
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 4, -3, -11, 2_000_000_000})
    void isPrimeNumberFalse(int number) {
        boolean result = PrimeLister.isPrimeNumber(number);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 11, 2_000_000_033})
    void isPrimeNumberTrue(int number) {
        boolean result = PrimeLister.isPrimeNumber(number);
        Assertions.assertTrue(result);
    }

}