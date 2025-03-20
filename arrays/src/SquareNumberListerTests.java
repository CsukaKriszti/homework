import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SquareNumberListerTests {
    @ParameterizedTest
    @ValueSource(ints = {0, -1, 2, -16})
    void isSquareNumberFalse(int number) {
        boolean result = SquareNumberLister.isSquareNumber(number);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 9, 16})
    void isSquareNumberTrue(int number) {
        boolean result = SquareNumberLister.isSquareNumber(number);
        Assertions.assertTrue(result);
    }


}
