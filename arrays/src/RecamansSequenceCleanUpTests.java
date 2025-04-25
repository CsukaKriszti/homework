import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecamansSequenceCleanUpTests {
    @Test
    void returnRecamansNumbersRecursive() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 3, 6, 2, 7, 13, 20, 12, 21, 11, 22, 10, 23, 9, 24));
        List<Integer> result = RecamansSequence.fillListWithRecamansNumberRecursive(16, 0, 0, new ArrayList<>());
        assertEquals(expected, result);
    }
}