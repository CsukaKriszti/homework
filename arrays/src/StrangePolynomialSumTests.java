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
    void testCountStrangePolynomialSumWithOne() {
        int number = 1;
        int result = StrangePolynomialSum.countStrangePolynomialSum(number);
        Assertions.assertEquals(1, result);
    }

    @Test
    void testCountStrangePolynomialSumWithZero() {
        int number = 0;
        int result = StrangePolynomialSum.countStrangePolynomialSum(number);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testCountStrangePolynomialSumWithFour() {
        int number = 4;
        int result = StrangePolynomialSum.countStrangePolynomialSum(number);
        Assertions.assertEquals(288, result);
    }

    @Test
    void testCountStrangePolynomialSumWithNegativeNumber() {
        int number = -1;
        int result = StrangePolynomialSum.countStrangePolynomialSum(number);
        Assertions.assertEquals(0, result);
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

    @Test
    void returnValidCurrentNumberIfTheNumberIs6() {
        int number = 6;
        int result = StrangePolynomialSum.determineIndex(number);
        Assertions.assertEquals(216, result);
    }

    @Test
    void returnValidCurrentNumberIfTheNumberIs5() {
        int number = 5;
        int result = StrangePolynomialSum.determineIndex(number);
        Assertions.assertEquals(50, result);
    }

    @Test
    void returnValidCurrentNumberIfTheNumberIs4() {
        int number = 4;
        int result = StrangePolynomialSum.determineIndex(number);
        Assertions.assertEquals(4, result);
    }

    @Test
    void returnValidCurrentNumberIfTheNumberIs3() {
        int number = 3;
        int result = StrangePolynomialSum.determineIndex(number);
        Assertions.assertEquals(27, result);
    }

    @Test
    void returnValidCurrentNumberIfTheNumberIs2() {
        int number = 2;
        int result = StrangePolynomialSum.determineIndex(number);
        Assertions.assertEquals(4, result);
    }

    @Test
    void returnValidCurrentNumberIfTheNumberIs1() {
        int number = 1;
        int result = StrangePolynomialSum.determineIndex(number);
        Assertions.assertEquals(1, result);
    }

    @Test
    void returnValidCurrentNumberIfTheNumberIsNegative() {
        int number = -1;
        int result = StrangePolynomialSum.determineIndex(number);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void returnDifficultStrangeSum2WhenTheNumberIsZero() {
        int number = 0;
        int result = StrangePolynomialSum.calculateDifficultStrangeSum2(number);
        Assertions.assertEquals(0, result);
    }

    @Test
    void returnDifficultStrangeSum2WhenTheNumberIsNegative() {
        int number = -1;
        int result = StrangePolynomialSum.calculateDifficultStrangeSum2(number);
        Assertions.assertEquals(0, result);
    }

    @Test
    void returnDifficultStrangeSum2WhenTheNumberIs1() {
        int number = 1;
        int result = StrangePolynomialSum.calculateDifficultStrangeSum2(number);
        Assertions.assertEquals(1, result);
    }

    @Test
    void returnDifficultStrangeSum2WhenTheNumber2() {
        int number = 2;
        int result = StrangePolynomialSum.calculateDifficultStrangeSum2(number);
        Assertions.assertEquals(-6, result);
    }

    @Test
    void returnDifficultStrangeSum2WhenTheNumberGreaterThan10() {
        int number = 11;
        int result = StrangePolynomialSum.calculateDifficultStrangeSum2(number);
        Assertions.assertEquals(6897, result);
    }

}
