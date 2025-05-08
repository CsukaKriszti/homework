import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExamPracticeLargeFirstTaskTests {
    @Test
    void returnFactorialsNumbersFor20() {
        Assertions.assertEquals(List.of(1, 1, 2, 6), ExamPracticeLargeFirstTask.getFactorialNumbers(20));
    }

    @Test
    void returnFactorialsNumbersFor120() {
        Assertions.assertEquals(List.of(1, 1, 2, 6, 24), ExamPracticeLargeFirstTask.getFactorialNumbers(120));
    }

    @Test
    void returnFactorialsNumbersFor1000000() {
        Assertions.assertEquals(List.of(1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880), ExamPracticeLargeFirstTask.getFactorialNumbers(1_000_000));
    }

    @Test
    void returnSumOfEverySecondElements() {
        List<Integer> numbers = List.of(1, 2, 0, -1, 5, -9, 3);
        Assertions.assertEquals(-8, ExamPracticeLargeFirstTask.sumEverySecondElements(numbers));
    }
}