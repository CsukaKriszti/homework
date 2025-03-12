import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateTipTest  {
    @Test
    void testNegativeValue() {
        int tipPercent = -10;
        int result = CalculateTip.checkAndReturnInRange(tipPercent);
        Assertions.assertEquals(-1, result);
    }
    @Test
    void testUpperBoundValue() {
        int tipPercent = 80;
        int result = CalculateTip.checkAndReturnInRange(tipPercent);
        Assertions.assertEquals(80, result);
    }
    @Test
    void testNegativeTipPercent() {
        int[] prices = {2000, 250, 300, 50, 250};
        int tipPercent = -1;
        int result = CalculateTip.calculateTip(prices, tipPercent);
        Assertions.assertEquals(-1, result);
    }
    @Test
    void testEmptyArray() {
        int[] prices = {};
        int tipPercent = 0;
        int result =  CalculateTip.calculateTip(prices, tipPercent);
        Assertions.assertEquals(0, result);
    }
}
