import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrangePolynomialSumTests {
    @Test
    void returnTrueWhenNumberLessThan1() {
        int number = 0;
        boolean result = StrangePolynomialSum.isGreaterThanOne(number);
        Assertions.assertTrue(result);
    }

    @Test
    void returnTrueWhenNumberIsMinus() {
        int number = -4;
        boolean result = StrangePolynomialSum.isGreaterThanOne(number);
        Assertions.assertTrue(result);
    }

    @Test
    void returnFalseWhenNumberGreaterThan1() {
        int number = 2;
        boolean result = StrangePolynomialSum.isGreaterThanOne(number);
        Assertions.assertFalse(result);
    }

}
