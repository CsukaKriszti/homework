import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSmallExercisesTests {
    @Test
    void returnSumOfBWords() {
        assertEquals(6, StringSmallExercises.countSumOfBWords("BgkgkDUUKBBBitrirBrrkrB"));
    }

    @Test
    void returnSumOfTargetWords() {
        assertEquals(3, StringSmallExercises.countSumOfTargetWords("hellohhheeellllooohellohello", "hello"));
    }
}