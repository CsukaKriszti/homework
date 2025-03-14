import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrangePolynomialSumTests {
    @Test
    void returnFalseWhenNumberLessThan1() {
        int number = 0;
        boolean result = StrangePolynomialSum.isGreaterThanOne(number);
        Assertions.assertFalse(result);
    }

    @Test
    void returnFalseWhenNumberIsNegative() {
        int number = -4;
        boolean result = StrangePolynomialSum.isGreaterThanOne(number);
        Assertions.assertFalse(result);
    }

    @Test
    void returnTrueWhenNumberGreaterThan1() {
        int number = 2;
        boolean result = StrangePolynomialSum.isGreaterThanOne(number);
        Assertions.assertTrue(result);
    }

    @Test
    void returnValidStrangePolynomialSum() {
        int number = 17;
        int result = StrangePolynomialSum.countStrangePolynomialSum(number);
        Assertions.assertEquals(96081, result);
    }

    @Test
    void returnValidStrangePolynomialSum2() {
        int number = 11;
        int result = StrangePolynomialSum.countStrangePolynomialSum2(number);
        Assertions.assertEquals(6208, result);
    }

    @Test
    void returnValidDifficultStrangePolynomialSum() {
        int number = 11;
        int result = StrangePolynomialSum.countDifficultStrangeSum(number);
        Assertions.assertEquals(6897, result);
    }


}
