import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ExamPracticeLargeThirdTaskTests {
    @Test
    void returnTribonacciNumbers() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 1, 1));
        List<Integer> expected = List.of(1, 1, 1, 3, 5, 9, 17, 31, 57, 105, 193, 355, 653);
        int listSize = 10;
        Assertions.assertEquals(expected, ExamPracticeLargeThirdTask.getTribonacciNumbers(numbers, listSize));
    }

    @Test
    void returnTribonacciNumbersIfListSize2() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 1, 1));
        List<Integer> expected = List.of(1, 1, 1, 3, 5);
        int listSize = 2;
        Assertions.assertEquals(expected, ExamPracticeLargeThirdTask.getTribonacciNumbers(numbers, listSize));
    }

    @Test
    void returnTribonacciNumbersIfListSizeIsNegativeNumber() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 1, 1));
        List<Integer> expected = List.of(1, 1, 1);
        int listSize = -2;
        Assertions.assertEquals(expected, ExamPracticeLargeThirdTask.getTribonacciNumbers(numbers, listSize));
    }

    @Test
    void returnTribonacciNumbersWithBigNumbers() {
        List<Integer> numbers = new ArrayList<>(List.of(20000, 500000, 1000000));
        List<Integer> expected = List.of(20000, 500000, 1000000, 1520000, 3020000, 5540000, 10080000, 18640000, 34260000, 62980000, 115880000, 213120000, 391980000);
        int listSize = 10;
        Assertions.assertEquals(expected, ExamPracticeLargeThirdTask.getTribonacciNumbers(numbers, listSize));
    }
}