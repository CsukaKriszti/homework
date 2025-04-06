import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MethodPractice2Tests {
    @Test
    void returnNegativeNumbers() {
        int[] negativeNumbers = {-99, -23, -78, -1};
        Assertions.assertArrayEquals(negativeNumbers, MethodPractice2.filterNegativeValues(11, 56, 0, -99, -23, 2, -78, -1));
    }

    @Test
    void returnSum() {
        Assertions.assertEquals(2, MethodPractice2.getCounter(1, -2, 3, -4));
    }

    @Test
    void returnFalseIfAllFalse() {
        boolean[] array = {false, false, false, false};
        assertFalse(MethodPractice2.calculateXorForBooleans(array));
    }

    @Test
    void returnFalseWithFourTrue() {
        boolean[] array = {true, true, true, true};
        assertFalse(MethodPractice2.calculateXorForBooleans(array));
    }

    @Test
    void returnTrueWithTreeTrue() {
        boolean[] array = {true, true, true};
        assertTrue(MethodPractice2.calculateXorForBooleans(array));
    }

    @Test
    void isEmptyArray() {
        boolean[] array = {};
        assertFalse(MethodPractice2.calculateXorForBooleans(array));
    }

    @ParameterizedTest
    @CsvSource({"850_000,157_250", "1_000_000,185_000", "0,0", "100 ,18.5"})
    void returnSocialSecurityTax(int number, double expected) {
        Assertions.assertEquals(expected, MethodPractice2.calculateSocialSecurityTax(number));
    }

    @ParameterizedTest
    @CsvSource({"850_000,127_500", "1_000_000,150_000", "0,0", "100 ,15", "157,23.55"})
    void returnPersonalIncomeTax(int number, double expected) {
        Assertions.assertEquals(expected, MethodPractice2.calculatePersonalIncomeTax(number));
    }

    @ParameterizedTest
    @CsvSource({"850_000,565_250", "1_000_000,665_000", "0,0", "100 ,66.5"})
    void returnHungarianNetSalary(int number, double expected) {
        Assertions.assertEquals(expected, MethodPractice2.calculateHungarianNetSalary(number));
    }

    @Test
    void returnStringsToLengths() {
        int[] expected = {5, 4, 6};
        assertArrayEquals(expected, MethodPractice2.convertStringsToLengths("apple", "pear", "cherry"));
    }

    @ParameterizedTest
    @CsvSource({"3,-1", "0,-1", "16,-1", "18,54", "1,3"})
    void returnTripleIfNotPrimeAndNotDivisibleByFour(int number, int expected) {
        Assertions.assertEquals(expected, MethodPractice2.calculateTripleIfNotPrimeAndNotDivisibleByFour(number));
    }

    @ParameterizedTest
    @CsvSource({"3,-1", "0,0", "16,32", "18,-1", "1,-1"})
    void returnDoubleIfDivisibleByFourAndNotPrime(int number, int expected) {
        Assertions.assertEquals(expected, MethodPractice2.calculateDoubleIfDivisibleByFourAndNotPrime(number));
    }

    @ParameterizedTest
    @CsvSource({"3,9", "5,25", "0,-1", "16,-1", "18,-1", "1,-1", "-3,-1"})
    void returnSquareIfPrime(int number, int expected) {
        Assertions.assertEquals(expected, MethodPractice2.calculateSquareIfPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 38, -5, -89})
    void isPrimeNumberFalse(int number) {
        Assertions.assertFalse(MethodPractice2.isPrimeNumber(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 89})
    void isPrimeNumberTrue(int number) {
        Assertions.assertTrue(MethodPractice2.isPrimeNumber(number));
    }

    @ParameterizedTest
    @CsvSource({"100,1", "72,1.3888888888888888", "100,1", "-1,-100", "0,0", "-10,-10", "3,33.333333333333336"})
    void returnHundredReciprocal(int number, double expected) {
        Assertions.assertEquals(expected, MethodPractice2.calculateHundredReciprocal(number));
    }

    @ParameterizedTest
    @CsvSource({"apple,120", "pear,24", "banana,720"})
    void returnStringLengthFactorial(String text, int expected) {
        Assertions.assertEquals(expected, MethodPractice2.calculateStringLengthFactorial(text));
    }

    @Test
    void returnZeroIfStringEmpty() {
        assertEquals(0, MethodPractice2.calculateStringLengthFactorial(""));
    }

    @ParameterizedTest
    @CsvSource({"apple,2.23606797749979", "pear,2,", "cherry,2.449489742783178"})
    void returnRootOfLength(String text, double expected) {
        Assertions.assertEquals(expected, MethodPractice2.calculateRootOfLength(text));
    }

    @ParameterizedTest
    @CsvSource({"22,10,-12", "10,22,12", "10,10,0"})
    void returnDifference(int firstNumber, int secondNumber, int expected) {
        Assertions.assertEquals(expected, MethodPractice2.calculateDifference(firstNumber, secondNumber));
    }

    @ParameterizedTest
    @CsvSource({"apple,10", "banana,12", "pear,8"})
    void returnStringLengthDouble(String text, int expected) {
        Assertions.assertEquals(expected, MethodPractice2.calculateStringLengthDouble(text));
    }

    @Test
    void returnNumberZeroIfStringEmpty() {
        assertEquals(0, MethodPractice2.calculateStringLengthDouble(""));
    }

    @ParameterizedTest
    @CsvSource({"0,0", "-1,-0.428", "100,42.8", "300,128.4", "850_000,363800"})
    void returnWeirdPercent(int number, double expected) {
        Assertions.assertEquals(expected, MethodPractice2.calculateWeirdPercent(number));
    }

    @ParameterizedTest
    @CsvSource({"0,0", "-1,-0.3", "100,30", "300,90", "850_000,255_000"})
    void returnThirtyPercent(int number, double expected) {
        Assertions.assertEquals(expected, MethodPractice2.calculateThirtyPercent(number));
    }
}
