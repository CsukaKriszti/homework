import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorizationTests {
    @ParameterizedTest
    @CsvSource({"0,false", "1,false", "2,true", "9,true"})
    void isBooleanListWithTrue(int listIndex, boolean expectedBoolean) {
        int number = 10;
        List<Boolean> result = PrimeFactorization.createBooleanListWithTrue(number);
        assertEquals(expectedBoolean, result.get(listIndex));
        assertEquals(10, result.size());
    }

    @ParameterizedTest
    @CsvSource({"0,false", "1,false", "2,true", "3,true", "4,false", "5,true", "6,false"})
    void isBooleanPrimeList(int listIndex, boolean expectedBoolean) {
        int number = 10;
        List<Boolean> result = PrimeFactorization.createPrimeBooleanList(number);
        assertEquals(expectedBoolean, result.get(listIndex));
        assertEquals(10, result.size());
    }

    @Test
    void shouldReturnPrimeNumbers() {
        List<Boolean> booleanPrimes = Arrays.asList(false, false, true, true, false, true);
        List<Integer> expectedPrimes = Arrays.asList(2, 3, 5);
        List<Integer> resultPrimes = PrimeFactorization.createPrimeList(booleanPrimes);
        assertEquals(expectedPrimes, resultPrimes);
    }

    @Test
    void shouldReturnPrimeFactorsOfNumber18() {
        int number = 18;
        List<Integer> expectedFactors = Arrays.asList(2, 3, 3);
        List<Integer> result = PrimeFactorization.getPrimeFactors(number);
        assertEquals(expectedFactors, result);
    }

    @Test
    void shouldReturnPrimeFactorsOfNumber100() {
        int number = 100;
        List<Integer> expectedFactors = Arrays.asList(2, 2, 5, 5);
        List<Integer> result = PrimeFactorization.getPrimeFactors(number);
        assertEquals(expectedFactors, result);
    }

    @Test
    void shouldReturnPrimeFactorsOfNumber130() {
        int number = 130;
        List<Integer> expectedFactors = Arrays.asList(2, 5, 13);
        List<Integer> result = PrimeFactorization.getPrimeFactors(number);
        assertEquals(expectedFactors, result);
    }
}