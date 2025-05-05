import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KrisztiFourthTaskTests {
    @Test
    void returnSumOfStrangeNumbers() {
        int[] numbers = {1, 2, 3, 4};
        Assertions.assertEquals(-3, KrisztiFourthTask.countStrangenumbers(numbers));
    }

    @Test
    void returnSumOfStrangeIfArrayEmpty() {
        int[] numbers = {};
        Assertions.assertEquals(0, KrisztiFourthTask.countStrangenumbers(numbers));
    }

}