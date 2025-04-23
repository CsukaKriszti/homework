import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSmallExercisesTests {
    @Test
    void returnSumOfBWords() {
        assertEquals(6, StringSmallExercises.countSumOfBWords("BgkgkDUUKBBBitrirBrrkrB"));
    }

    @ParameterizedTest
    @CsvSource({"dhrbbbggfhrelelo,0", "hellofjfjfjfjf,1", "hello,1", "hell,0", "djfhghtthello,1", "fhellovbvbhellodggdgdhellofhfhfhelloo,4"})
    void returnSumOfTargetWords(String text, int result) {
        assertEquals(result, StringSmallExercises.countSumOfTargetWords(text));
    }
}