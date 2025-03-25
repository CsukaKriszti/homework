import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfPerfectSquaresTests {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void isValidNumberTrue(int number) {
        boolean result = SumOfPerfectSquares.isValidNumber(number);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -2})
    void isValidNumberFalse(int number) {
        boolean result = SumOfPerfectSquares.isValidNumber(number);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({"-1,0", "0,0", "1,1", "5,55", "10,385"})
    void returnValidSumOfPerfectSquares(int number, int expected) {
        int result = SumOfPerfectSquares.countSumOfPerfectSquares(number);
        assertEquals(expected, result);
    }
}