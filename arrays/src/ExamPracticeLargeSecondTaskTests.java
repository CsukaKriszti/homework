import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExamPracticeLargeSecondTaskTests {
    @Test
    void returnPerfectSquaresFor50() {
        Assertions.assertEquals(List.of(1, 4, 9, 16, 25, 36, 49), ExamPracticeLargeSecondTask.getPerfectSquares(50));
    }

    @Test
    void returnPerfectSquaresFor121() {
        Assertions.assertEquals(List.of(1, 4, 9, 16, 25, 36, 49, 64, 81, 100), ExamPracticeLargeSecondTask.getPerfectSquares(121));
    }

    @Test
    void returnPerfectSquares122() {
        Assertions.assertEquals(List.of(1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121), ExamPracticeLargeSecondTask.getPerfectSquares(122));
    }

    @Test
    void returnSumOfEveryFifthElements() {
        List<Integer> numbers = List.of(1, 2, 0, -1, 5, -9, 3, 22, 4, -7, 9, 11, 3, 6, -1);
        Assertions.assertEquals(-3, ExamPracticeLargeSecondTask.sumEveryFifthElements(numbers));
    }
}