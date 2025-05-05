import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;


public class CollatzSequenceTests {
    @Test
    void shouldReturnCollatzSequenceOf5(){
        int number = 5;
        List<Integer> numbers = CollatzSequence.generateCollatzSequence(number);
        Assertions.assertEquals(List.of(5,16,8,4,2,1), numbers);

    }
    @Test
    void shouldReturnCollatzSequenceOf7(){
        int number = 7;
        List<Integer> numbers = CollatzSequence.generateCollatzSequenceDoWhile(number);
        Assertions.assertEquals(List.of(7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1), numbers);

    }
}
