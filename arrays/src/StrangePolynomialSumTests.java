import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class StrangePolynomialSumTests {
    @ParameterizedTest
    @ValueSource(ints = {0, -4, 1})
    void isGreaterThanOneFalse(int number) {
        boolean result = StrangePolynomialSum.isGreaterThanOne(number);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3})
    void isGreaterThanOneTrue(int number) {
        boolean result = StrangePolynomialSum.isGreaterThanOne(number);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "-1,0", "1,1", "4 ,288", "17,96081"})
    void returnValidStrangePolynomialSum(int number, int expected) {
        int result = StrangePolynomialSum.countStrangePolynomialSum(number);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"-1,-1", "1,1", "2,4", "3,27", "4,4", "5,50", "6,216"})
    void returnValidModifiedNumber(int number, int expected) {
        int result = StrangePolynomialSum.numberModifier(number);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "-1,0", "1,1", "2,-6", "11,6897"})
    void returnValidDifficultStrangeSum2(int number, int expected) {
        int result = StrangePolynomialSum.calculateDifficultStrangeSum2(number);
        Assertions.assertEquals(expected, result);
    }

}
