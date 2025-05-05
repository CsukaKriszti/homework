import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExamPracticeSmallTasksTests {
    @ParameterizedTest
    @CsvSource({"0,true", "1,true", "-1,false", "2,false", "16,true"})
    void testIsPerfectSquare(int number, boolean isPerfectSquare) {
        assertEquals(isPerfectSquare, ExamPracticeSmallTasks.isPerfectSquare(number));
    }

    @Test
    void testIsPerfectSquaresAndEvenNumbers() {
        List<Integer> numbers = Arrays.asList(4, 9, 16, 25, 36);
        List<Boolean> expected = Arrays.asList(true, false, true, false, true);
        List<Boolean> results = isPerfectSquaresAndEvenNumbers(numbers);
        assertEquals(expected, results);
    }

    public List<Boolean> isPerfectSquaresAndEvenNumbers(List<Integer> numbers) {
        List<Boolean> result = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0 && isPerfectSquare(number)) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    @Test
    void shouldGetSqrtOfMaxMinDifference() {
        List<Integer> numbers = Arrays.asList(4, 9, 16, 25, 36, 0);
        int expected = 6;
        int results = getSqrtOfMaxMinDifference(numbers);
        assertEquals(expected, results);
    }

    public int getSqrtOfMaxMinDifference(List<Integer> numbers) {
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        return (int) Math.sqrt(max - min);
    }

    @Test
    void shouldSumDifferenceOfOddEven() {
        List<Integer> numbers = Arrays.asList(4, 9, 16, 25, 36, 0);
        int expected = -22;
        int results = getSumDifferenceOfOddEven(numbers);
        assertEquals(expected, results);
    }

    public int getSumDifferenceOfOddEven(List<Integer> numbers) {
        int sumOfOddNumbers = 0;
        int sumOfEvenNumbers = 0;
        for (int number : numbers) {
            sumOfEvenNumbers += (number % 2 == 0) ? number : 0;
            sumOfOddNumbers += (number % 2 != 0) ? number : 0;
        }
        return sumOfOddNumbers - sumOfEvenNumbers;
    }

    @Test
    void returnMaxDifference() {
        int[] numbers = {0, -1, 3, 8, 11, 25};
        assertEquals(26, ExamPracticeSmallTasks.findMaxDifference(numbers));
    }
}