import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayFunTests {
    @Test
    void returnAverage() {
        assertEquals(2, ArrayFun.calculateAverage(0, 1, 2, 3, 4, -5, 6, 7, 8, 9, -10));
    }

    @Test
    void testCountOddNumbers() {
        assertEquals(3, ArrayFun.countOddNumbers(1, -5, 0, 56, -89));
    }

    @Test
    void returnArrayWithOddNumbersSquared() {
        int[] expected = {1, 49, 81, 1089};
        int[] result = ArrayFun.fillArrayWithOddNumbersSquared(0, 1, -4, 7, 9, 78, 33);
        assertArrayEquals(expected, result);
    }

    @Test
    void returnCorrectCountForAStartingStrings() {
        List<String> texts = Arrays.asList("Alice", "is", "as", "curious", "as", "ever");
        assertEquals(3, ArrayFun.countStringsStartingWithA(texts));
    }

    @Test
    void returnConcatenatedWordsLongerThanThree() {
        List<String> texts = Arrays.asList("Alice", "Is", "As", "Curious", "As", "Ever");
        assertEquals("AliceCuriousEver", ArrayFun.concatenateWordsLongerThanThree(texts));
    }

    @Test
    void testHasDuplicatesTrue() {
        int[] numbers = {3, 5, 6, 7, 8, 9, 9};
        assertTrue(ArrayFun.hasConsecutiveDuplicates(numbers));
    }

    @Test
    void testHasDuplicatesFalse() {
        int[] numbers = {3, 5, 6, 7, 3, 6, 5};
        assertFalse(ArrayFun.hasConsecutiveDuplicates(numbers));

    }

    @Test
    void returnSumOfVowels() {
        String[][] texts = {{"I", "love", "coffee"}, {"Books", "teach", "wisdom"}, {"Music", "calms", "minds"}};
        assertEquals(16, ArrayFun.countVowelSumInMatrix(texts));
    }

    @Test
    void returnSumLongestStrings() {
        String[][] texts = {{"I", "love", "tea"}, {"The", "sun", "is", "shining"}, {"The", "birds", "are", "singing"}};
        assertEquals(17, ArrayFun.countSumLongestStrings(texts));
    }

    @Test
    void returnMatrixSize() {
        String[][] texts = {{"I", "love", "tea"}, {"The", "sun", "is", "shining"}, {"The", "birds", "are", "singing"}};
        assertEquals(11, ArrayFun.calculateMatrixSize(texts));
    }

    @Test
    void returnUppercaseArray() {
        String[][] texts = {{"I", "love", "tea"}, {"The", "sun", "is", "shining"}, {"The", "birds", "are", "singing"}};
        String[] expected = {"I", "LOVE", "TEA", "THE", "SUN", "IS", "SHINING", "THE", "BIRDS", "ARE", "SINGING"};
        assertArrayEquals(expected, ArrayFun.convertToUppercaseArray(texts));
    }

    @Test
    void testHasNumberInMatrix() {
        String[][] texts = {{"10", "birds", "sit", "on", "2", "branches"}, {"2", "*", "2", "is", "sometime", "5"}};
        boolean[][] expected = {{true, false, false, false, true, false}, {true, false, true, false, false, true}};
        assertArrayEquals(expected, ArrayFun.hasNumberInMatrix(texts));
    }

    @Test
    void returnAverageAllCharacters() {
        String[][] texts = {{"10", "birds", "sit", "on", "2", "branches"}, {"2", "*", "2", "is", "sometime", "5"}};
        assertEquals(2.9166666666666665, ArrayFun.countAverageAllCharacters(texts));
    }

    @Test
    void returnInvertedWord() {
        assertEquals("seirots", ArrayFun.reverseString("stories"));
    }

    @Test
    void returnSumOfPalindromes() {
        String[][][] texts = {{{"radar", "pear", "world"}, {"noon", "ham", "apple"}}, {{"deified", "lip", "banana"}, {"hello", "madam", "red"}}};
        assertEquals(4, ArrayFun.countPalindromeWords(texts));
    }

    @Test
    void returnTotalStringsInThirdLevel() {
        String[][][] texts = {{{"radar", "pear", "world"}, {"noon", "ham", "apple"}}, {{"deified", "lip", "banana"}, {"hello", "madam", "red"}}};
        assertEquals(12, ArrayFun.countTotalStringsInThirdLevel(texts));
    }

    @Test
    void returnArrayWithStringsLength() {
        String[][][] texts = {{{"pear", "world"}, {"noon"}}, {{"banana"}, {"hello"}}};
        int[] result = {4, 5, 4, 6, 5};
        assertArrayEquals(result, ArrayFun.fillArrayWithStringsLength(texts));
    }

    @Test
    void testConcatMinLength2() {
        String[][][] texts = {{{"E", "a"}, {"AB"}}, {{"banana"}, {"hello"}}};
        assertEquals("ABbananahello", ArrayFun.concatenateStringsMinLength2(texts));
    }

    @Test
    void returnMaxStringLength() {
        String[][][] texts = {{{"E", "a"}, {"AB"}}, {{"Banana Joe"}, {"hello"}}};
        assertEquals(10, ArrayFun.findMaxStringLength(texts));
    }

    @Test
    void isTrueStringEndingWithSInEverySubarray() {
        String[][][] texts = {{{"E", "as"}, {"ooo", "ABS"}}, {{"Bananas"}, {"sos"}}};
        assertTrue(ArrayFun.hasStringEndingWithSInEverySubarray(texts));
    }

    @Test
    void isFalseStringEndingWithSInEverySubarray() {
        String[][][] texts = {{{"E", "a"}, {"ABs"}}, {{"Bananas"}, {"hello"}}};
        assertFalse(ArrayFun.hasStringEndingWithSInEverySubarray(texts));
    }

    @Test
    void returnTrueIfSTheLastWord() {
        String[] text = {"apples", "pear"};
        assertTrue(ArrayFun.hasWordEndingWithS(text));
    }

    @Test
    void returnFalseIfNotSTheLastWord() {
        String[] text = {"apple", "pear"};
        assertFalse(ArrayFun.hasWordEndingWithS(text));

    }

    @Test
    void returnTrueIfAllLowercaseCharacters() {
        String text = "apples";
        assertTrue(ArrayFun.isAllLowercaseCharacter(text));
    }

    @Test
    void returnFalseIfAllLowercaseCharacters() {
        String text = "Apples";
        assertFalse(ArrayFun.isAllLowercaseCharacter(text));

    }

    @Test
    void returnSumOfLowercaseStrings() {
        String[][][][] texts = {{{{"AA", "Bb"}, {"Cc", "DD"}}, {{"ee", "F"}, {"gggggg", "H"}}},
                {{{"Ii", "Jj"}, {"Kk", "Ll"}}, {{"Mmmmm", "Nnnnnn"}, {"Ooooo", "Pppppp"}}}};
        assertEquals(2, ArrayFun.countLowercaseStrings(texts));
    }

    @Test
    void returnReverseChar4DArray() {
        String[][][][] chars = {{{{"Ab", "Ba"}, {"Ca", "Da"}}, {{"Ea", "Fa"}, {"Ga", "Ha"}}},
                {{{"Ia", "Ja"}, {"Ka", "La"}}, {{"Ma", "Na"}, {"Oa", "Pa"}}}};
        String[][][][] result = {{{{"bA", "aB"}, {"aC", "aD"}}, {{"aE", "aF"}, {"aG", "aH"}}},
                {{{"aI", "aJ"}, {"aK", "aL"}}, {{"aM", "aN"}, {"aO", "aP"}}}};
        assertArrayEquals(result, ArrayFun.reverseString4DArray(chars));

    }

    @Test
    void returnAverageStringLength() {
        String[][][][] texts = {{{{"aaA", "bbB"}, {"ccC", "ddD"}}, {{"eE", "fF"}, {"ggg", "hhh"}}},
                {{{"iiii", "jjjj"}, {"kkkk", "llll"}}, {{"mmmm", "nnnn"}, {"oo", "pp"}}}};
        assertEquals(3, ArrayFun.calculateAverageStringLength(texts));
    }

    @Test
    void returnListStringsWithMoreThanTwoVowels() {
        String[][][][] texts = {{{{"aaA", "babB"}, {"ccC", "dadaD"}}, {{"eE", "fF"}, {"gegg", "hhh"}}},
                {{{"iiii", "jjjj"}, {"kkookk", "lloll"}}, {{"memimum", "nniinn"}, {"oo", "pp"}}}};
        List<String> result = new ArrayList<>(List.of("aaA", "iiii", "memimum"));
        assertEquals(result, ArrayFun.getStringsWithMoreThanTwoVowels(texts));
    }

    @Test
    void returnShortestStringsIn4DArray() {
        String[][][][] texts = {{{{"aaA", "babB"}, {"ccC", "dadaD"}}, {{"eE", "fF"}, {"gegg", "hhh"}}},
                {{{"iiii", "jjjj"}, {"kkookk", "lloll"}}, {{"memimum", "nniinn"}, {"oo", "pp"}}}};
        assertEquals("eE", ArrayFun.findShortestString(texts));
    }

    @ParameterizedTest
    @CsvSource({"level", "lEvEl", "raw"})
    void testHasEorRTrue(String text) {
        assertTrue(ArrayFun.hasEorR(text));
    }

    @ParameterizedTest
    @CsvSource({"tv", "disco", "Roma"})
    void testHasEorRFalse(String text) {
        assertFalse(ArrayFun.hasEorR(text));
    }

    @Test
    void returnSumOfStringsWithoutEorR() {
        String[][][][][] texts = {{{{{"aaa"}, {"bbb"}}, {{"ccc"}, {"ddd"}}}, {{{"eee"}, {"fff"}}, {{"ggg"}, {"rrr"}}}}, {{{{"AAA"}, {"BBB"}}, {{"CCC"}, {"DDD"}}}, {{{"EEE"}, {"FFF"}}, {{"GGG"}, {"HHH"}}}}};
        assertEquals(13, ArrayFun.countStringsWithoutEorR(texts));
    }

    @Test
    void returnStringsWithLengths() {
        String[][][][][] texts = {{{{{"a"}, {"bb"}}, {{"ccc"}, {""}}}, {{{"eee"}, {"fff"}}, {{"ggg"}, {"rrr"}}}}, {{{{"AAA"}, {"BBB"}}, {{"CCC"}, {"DDD"}}}, {{{"EEE"}, {"FFF"}}, {{"GGG"}, {"HHH"}}}}};
        int[][][][][] result = {{{{{1}, {2}}, {{3}, {0}}}, {{{3}, {3}}, {{3}, {3}}}}, {{{{3}, {3}}, {{3}, {3}}}, {{{3}, {3}}, {{3}, {3}}}}};
        assertArrayEquals(result, ArrayFun.replaceStringsWithLengths(texts));
    }

    @ParameterizedTest
    @CsvSource({"level", "lEvEl", "wow"})
    void testWordsWithSameStartEndTrue(String text) {
        assertTrue(ArrayFun.isWordsWithSameStartEnd(text));
    }

    @ParameterizedTest
    @CsvSource({"levels", "true", "false"})
    void testWordsWithSameStartEndFalse(String text) {
        assertFalse(ArrayFun.isWordsWithSameStartEnd(text));
    }

    @Test
    void returnSumOfWordsWithSameStartEnd() {
        String[][][][][] texts = {{{{{"za"}, {"bbaa"}}, {{"cccaaa"}, {"sd"}}}, {{{"eee"}, {"fff"}}, {{"ggg"}, {"rrr"}}}}, {{{{"AAA"}, {"BBB"}}, {{"CCC"}, {"DDD"}}}, {{{"EEE"}, {"FFF"}}, {{"GGG"}, {"HHH"}}}}};
        assertEquals(36, ArrayFun.countCharactersInWordsWithSameStartEnd(texts));
    }

    @Test
    void returnConcatenatedStrings() {
        String[][][][][] texts = {{{{{"a"}, {"bb"}}, {{"ccc"}, {""}}}, {{{"eee"}, {"fff"}}, {{"ggg"}, {"rrr"}}}}, {{{{"AAA"}, {"BBB"}}, {{"CCC"}, {"DDD"}}}, {{{"EEE"}, {"FFF"}}, {{"GGG"}, {"HHH"}}}}};
        assertEquals("abbccceeefffgggrrrAAABBBCCCDDDEEEFFFGGGHHH", ArrayFun.concatenateAllStrings(texts));
    }
}