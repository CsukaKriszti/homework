import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateTipTest {
    @Test
    void returnFalseWhenNumberLessThan10() {
        int number = 9;
        boolean result = CalculateTip.isValidNumber(number);
        Assertions.assertFalse(result);
    }

    @Test
    void returnFalseWhenNumberGreaterThan80() {
        int number = 81;
        boolean result = CalculateTip.isValidNumber(number);
        Assertions.assertFalse(result);
    }

    @Test
    void returnTrueWhenNumberEqualTo10() {
        int number = 10;
        boolean result = CalculateTip.isValidNumber(number);
        Assertions.assertTrue(result);
    }

    @Test
    void returnTrueWhenNumberEqualTo80() {
        int number = 80;
        boolean result = CalculateTip.isValidNumber(number);
        Assertions.assertTrue(result);
    }

    @Test
    void returnTrueWhenTheNumberBetween10And80() {
        int number = 79;
        boolean result = CalculateTip.isValidNumber(number);
        Assertions.assertTrue(result);
    }

    @Test
    void returnMinusOneWhenNumberLessThan10() {
        int number = 9;
        int result = CalculateTip.getTipWithinRange(number);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void returnTheNumberWhenEqualTo10() {
        int number = 10;
        int result = CalculateTip.getTipWithinRange(number);
        Assertions.assertEquals(number, result);
    }

    @Test
    void returnTheNumberWhenEqualTo80() {
        int number = 80;
        int result = CalculateTip.getTipWithinRange(number);
        Assertions.assertEquals(number, result);
    }

    @Test
    void returnTheNumberWhenThisNumberBetween10And80() {
        int number = 11;
        int result = CalculateTip.getTipWithinRange(number);
        Assertions.assertEquals(number, result);
    }

    @Test
    void returnMinusOneWhenNumberGreaterThan80() {
        int number = 81;
        int result = CalculateTip.getTipWithinRange(number);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void returnCorrectTotal() {
        int[] numbers = {200, 450, 3240, 7610, 1870};
        int result = CalculateTip.calculateSumPrices(numbers);
        Assertions.assertEquals(13370, result);
    }

    @Test
    void returnCorrectTip() {
        int[] numbers = {200, 450, 3240, 7610, 1870};
        int tip = 20;
        int result = CalculateTip.calculateTip(numbers, tip);
        Assertions.assertEquals(2674, result);
    }

    @Test
    void returnMinusOneWhenTheTipPercentLessThen10() {
        int[] numbers = {200, 450, 3240, 7610, 1870};
        int tip = 5;
        int result = CalculateTip.calculateTip(numbers, tip);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void returnMinusOneWhenTheTipPercentGreaterThen80() {
        int[] numbers = {200, 450, 3240, 7610, 1870};
        int tip = 100;
        int result = CalculateTip.calculateTip(numbers, tip);
        Assertions.assertEquals(-1, result);
    }

}

