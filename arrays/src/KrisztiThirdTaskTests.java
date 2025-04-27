import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KrisztiThirdTaskTests {
    @Test
    void returnNumberOfSumOfFalseValue() {
        boolean[][][] array = {
                {
                        {false, false, true},
                        {false, false, true},
                        {true, false, false}
                },
                {
                        {true, false, true},
                        {false, true, false}
                }
        };
        Assertions.assertEquals(9, KrisztiThirdTask.countFalseValue(array));
    }

}