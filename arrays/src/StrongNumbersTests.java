import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrongNumbersTests {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 145})
    void isValidFactorialNumberTrue(int number) {
        boolean result = StrongNumbers.isValidFactorialNumber(number);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 146})
    void isValidFactorialNumberFalse(int number) {
        boolean result = StrongNumbers.isValidFactorialNumber(number);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({"123, 1, 2, 3", "456, 4, 5, 6"})
    void validateSplitNumberInto3Digits(int number, int expected1, int expected2, int expected3) {
        int[] result = StrongNumbers.splitNumberIntoDigits(number);
        assertArrayEquals(new int[]{expected1, expected2, expected3}, result);
    }

    @ParameterizedTest
    @CsvSource({"10, 1, 0", "99,9,9"})
    void validateSplitNumberInto2Digits(int number, int expected1, int expected2) {
        int[] result = StrongNumbers.splitNumberIntoDigits(number);
        assertArrayEquals(new int[]{expected1, expected2}, result);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "9,9"})
    void validateSplitNumberInto2Digits(int number, int expected) {
        int[] result = StrongNumbers.splitNumberIntoDigits(number);
        assertArrayEquals(new int[]{expected}, result);
    }

    @ParameterizedTest
    @CsvSource({"0,1", "1,1", "2,2", "3,6,", "4,24"})
    void returnFactorialNumber(int number, int expected) {
        int result = StrongNumbers.calculateFactorial(number);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"123, 1, 2, 6", "456, 24, 120, 720", "100, 1,1,1"})
    void validateConvert3DigitsToFactorials(int number, int expected1, int expected2, int expected3) {
        int[] result = StrongNumbers.convertDigitsToFactorials(number);
        assertArrayEquals(new int[]{expected1, expected2, expected3}, result);
    }

    @ParameterizedTest
    @CsvSource({"10, 1, 1", "99,362_880,362_880",})
    void validateConvert2DigitsToFactorials(int number, int expected1, int expected2) {
        int[] result = StrongNumbers.convertDigitsToFactorials(number);
        assertArrayEquals(new int[]{expected1, expected2}, result);
    }

    @ParameterizedTest
    @CsvSource({"0, 1", "1,1", "2,2", "9,362_880"})
    void validateConvert1DigitsToFactorials(int number, int expected) {
        int[] result = StrongNumbers.convertDigitsToFactorials(number);
        assertArrayEquals(new int[]{expected}, result);
    }

    @Test
    void validateCalculateSum() {
        int[] numbers = {1, 2, 3, 4};
        int result = StrongNumbers.calculateSum(numbers);
        Assertions.assertEquals(10, result);
    }

    @ParameterizedTest
    @CsvSource({"123,9", "100,3", "1,1", "0,1"})
    void validateCalculateFactorialSum(int number, int expected) {
        int result = StrongNumbers.calculateFactorialSum(number);
        Assertions.assertEquals(expected, result);
    }

}