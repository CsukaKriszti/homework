import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ExamPracticeMediumTasksTests {
    @Test
    void returnTrueIfAllValuesTrue() {
        boolean[][][][] array4D = {{{{true, true}, {true, true}}, {{true, true}, {true, true}}},
                {{{true, true}, {true, true}}, {{true, true}, {true, true}}}};
        Assertions.assertTrue(ExamPracticeMediumTasks.areAllValuesTrue(array4D));
    }

    @Test
    void returnFalseIfContainFalse() {
        boolean[][][][] array4D = {{{{true, true}, {true, true}}, {{true, true}, {true, true}}},
                {{{true, true}, {true, true}}, {{true, true}, {true, false}}}};
        Assertions.assertFalse(ExamPracticeMediumTasks.areAllValuesTrue(array4D));
    }

    @Test
    void returnMultiplyByIndexSum() {
        int[] numbers = {1, 6, 3, 5, 8, 9};
        Assertions.assertEquals(104, ExamPracticeMediumTasks.multiplyByIndexAndSum(numbers));
    }

    @Test
    void returnMultiplyByIndexSumWithNegativeNumbers() {
        int[] numbers = {-1, -6, -3, -5, -8, -9};
        Assertions.assertEquals(-104, ExamPracticeMediumTasks.multiplyByIndexAndSum(numbers));
    }

    @Test
    void returnStrangePatternSum() {
        int[] numbers = {1, 0, 1, -1, -6, 9};
        Assertions.assertEquals(14, ExamPracticeMediumTasks.calculateStrangePatternSum(numbers));
    }

    @Test
    void returnSpecialPatternSum() {
        int[] numbers = {1, 0, 1, -1, -6, 9};
        Assertions.assertEquals(20, ExamPracticeMediumTasks.calculateSpecialPatternSum(numbers));
    }
}