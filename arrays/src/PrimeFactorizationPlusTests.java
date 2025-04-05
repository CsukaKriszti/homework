import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorizationPlusTests {
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

