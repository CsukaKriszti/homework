import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmicPracticeTests {
    @ParameterizedTest
    @ValueSource(strings = {"rotor", "mom", "lol"})
    void isPalindromeTrue(String text) {
        assertTrue(AlgorithmicPractice.isPalindrome(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "pear", "snow"})
    void isPalindromeFalse(String text) {
        assertFalse(AlgorithmicPractice.isPalindrome(text));
    }

    @ParameterizedTest
    @CsvSource({"aaabbbbbbaaaaccccc,a2b5a3c4", "abaabbbbababaaa,a0b0a1b3a0b0a0b0a2"})
    void returnCompressText(String text, String result) {
        assertEquals(result, AlgorithmicPractice.compressText(text));
    }

    @ParameterizedTest
    @CsvSource({"1901,1091", "100,1", "-100,-1", "-98456,-65489"})
    void returnReservedNumber(int number, int result) {
        assertEquals(result, AlgorithmicPractice.getReversedNumber(number));
    }

    @ParameterizedTest
    @CsvSource({"18,12,6", "25,10,5", "48,36,12", "81,27,27", "103,101,1"})
    void returnGreatestCommonDivisor(int firstNumber, int secondNumber, int result) {
        assertEquals(result, AlgorithmicPractice.determineGreatestCommonDivisor(firstNumber, secondNumber));
    }
}