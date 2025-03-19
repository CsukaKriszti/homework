import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareNumberListerTests {
    @Test
    void isNumberZeroReturnFalse() {
        int number = 0;
        boolean result = SquareNumberLister.isSquareNumber(number);
        Assertions.assertFalse(result);
    }

    @Test
    void isNumberNegativeReturnFalse() {
        int number = -1;
        boolean result = SquareNumberLister.isSquareNumber(number);
        Assertions.assertFalse(result);
    }

    @Test
    void isNumber1ReturnTrue() {
        int number = 1;
        boolean result = SquareNumberLister.isSquareNumber(number);
        Assertions.assertTrue(result);
    }

    @Test
    void isNumber2ReturnFalse() {
        int number = 2;
        boolean result = SquareNumberLister.isSquareNumber(number);
        Assertions.assertFalse(result);
    }

    @Test
    void isNumber3ReturnFalse() {
        int number = 0;
        boolean result = SquareNumberLister.isSquareNumber(number);
        Assertions.assertFalse(result);
    }

    @Test
    void isNumber4ReturnTrue() {
        int number = 4;
        boolean result = SquareNumberLister.isSquareNumber(number);
        Assertions.assertTrue(result);
    }
}
