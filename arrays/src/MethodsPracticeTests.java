import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class MethodsPracticeTests {
    @ParameterizedTest
    @CsvSource({"4,alma", "5,körte", "6,szilva", "27,szomolyai fekete cseresznye"})
    void verifyStringLength(int size, String text) {
        int result = MethodsPractice.getLength(text);
        Assertions.assertEquals(size, result);
    }

    @ParameterizedTest
    @CsvSource({"4,2", "100,50", "6,3", "26,13"})
    void verifyMultiplicationByTwo(int twiceTheValue, int number) {
        int result = MethodsPractice.multiplyByTwo(number);
        Assertions.assertEquals(twiceTheValue, result);
    }
    @ParameterizedTest
    @CsvSource({"1,0","1,1", "2,2", "6,3", "24,4","120,5"})
    void verifyFactorialComputation(int factorial, int number) {
        int result = MethodsPractice.calculateFactorial(number);
        Assertions.assertEquals(factorial, result);
    }
    @ParameterizedTest
    @CsvSource({"0,0","1,1", "8,2", "27,3", "64,4","125,5"})
    void verifyCubeComputation(int cube, int number) {
        int result = MethodsPractice.calculateCube(number);
        Assertions.assertEquals(cube, result);
    }
    @Test
    void returnTrueIfAllTrue() {
        boolean[] array = {true, true, true};
        boolean result = MethodsPractice.isTrue(array);
        assertTrue(result);
    }

    @Test
    void returnFalseIfContainsFalse() {
        boolean[] array = {true, false, true};
        boolean result = MethodsPractice.isTrue(array);
        assertFalse(result);
    }

    @Test
    void returnFalseIfAllFalse() {
        boolean[] array = {false, false, false};
        boolean result = MethodsPractice.isTrue(array);
        assertFalse(result);
    }

    @Test
    void isEmptyArray() {
        boolean[] array = {};
        boolean result = MethodsPractice.isTrue(array);
        assertTrue(result);
    }
    @Test
    void returnEvenIndexElements(){
        int[] numbers = {11,12,55,68,43,34};
        int[] expected = {11,55,43};
        int[] result = MethodsPractice.getElementsInEvenIndex(numbers);
        assertArrayEquals(expected,result);
    }
    @Test
    void returnEvenIndexElements2(){
        int[] numbers = {11,12,55,68,43,34,55};
        int[] expected = {11,55,43,55};
        int[] result = MethodsPractice.getElementsInEvenIndex(numbers);
        assertArrayEquals(expected,result);
    }

}