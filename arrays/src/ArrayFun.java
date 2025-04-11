import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayFun {
    public static void main(String[] args) {
        System.out.println("1. Return the average of all even numbers in an array of integers. ");
        int[] numbers = {0, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        System.out.println(countAverage(numbers));
        System.out.println("2. Return a new array with each number squared " +
                "only if the original number was odd. If the original number" +
                " was even, skip it from the new array.");
        System.out.println(Arrays.toString(fillArrayWithOddNumbersSquared(numbers)));
        System.out.println("3. Return the number of strings that start with the letter \"a\" or \"A\".");
        List<String> fruits = new ArrayList<>(Arrays.asList("fig", "apple", "pear", "pineapple", "cherry", "orange", "Avocado", "Apricot", "banana", "grape", "kiwi"));
        System.out.println(countStringsStartingWithA(fruits));
        System.out.println("4. Return the concatenation of all strings that are longer than 3 characters.");
        System.out.println(concatenateWordsLongerThanThree(fruits));
        System.out.println("5. Return true if the array of integers contains any consecutive duplicates.");
        System.out.println(hasConsecutiveDuplicates(numbers));
        System.out.println("6. Return the total number of vowels in a 2D array of strings. (you don’t have to consider non-English vowels, only a, e, i, o and u).");
        String[][] texts = {{"I", "love", "coffee"}, {"Books", "teach", "wisdom"}, {"Music", "calms", "minds"}};
        System.out.println(countVowelSumInMatrix(texts));
        System.out.println("7. Return the sum of the lengths of the longest string from each row (subarray).");
        System.out.println(countSumLongestStrings(texts));
        System.out.println("8. Return a one-dimensional (in other words: flattened) array of all strings in uppercase.");
        System.out.println(Arrays.toString(convertToUppercaseArray(texts)));
        System.out.println("9. Return a new 2D array of booleans where each element is true if the corresponding string contains a digit.");
        String[][] textsAndNumbers = {{"She", "has", "2", "cats"}, {"Buy", "5", "apples", "today"}, {"We", "met", "3", "times"}};
        System.out.println(Arrays.deepToString(hasNumberInMatrix(textsAndNumbers)));
        System.out.println("10. Return the average number of characters per string across all elements.");
        System.out.println(countAverageAllCharacters(textsAndNumbers));
        System.out.println("11. Return the number of strings that are palindromes (same forward and backward" +
                " - for example: “racecar” is read the same way if you read it from forward and backward).");
        String[][][] palindromeAndNormalWords = {{{"radar", "a", "world"}, {"noon", "civic", "apple", "pear"}}, {{"deified", "rotor", "bananas"}, {"madam", "refer"}}};
        System.out.println(countPalindromeWords(palindromeAndNormalWords));
        System.out.println("12 Return a 1D array of integers representing the number of strings in each sub-subarray (3rd level).");
        System.out.println((Arrays.toString(fillArrayWithStringsLength(palindromeAndNormalWords))));
        System.out.println("13. Return the concatenation of all strings, but skip strings shorter than 2 characters.");
        System.out.println(concatenateStringsMinLength2(palindromeAndNormalWords));
        System.out.println("14. Return the maximum length of a string in the entire 3D array.");
        System.out.println(findMaxStringLength(palindromeAndNormalWords));
        String[][][] texts2 = {{{"Es", "a"}, {"ooo", "ABS"}}, {{"Bananas"}, {"soo"}}};
        System.out.println("15. Return true if every subarray (3rd level) contains at least one string that ends with.");
        System.out.println(hasAllSubarraysContainStringEndingWithS(texts2));
        System.out.println("16. Return the total count of strings that contain only lowercase letters. " +
                "Note: you can use Character.isLowerCase() to decide whether a character is lowercase or not.");
        char[][][][] characters = {{{{'A', 'b'}, {'c', 'D'}}, {{'e', 'F'}, {'G', 'h'}}},
                {{{'i', 'J'}, {'K', 'l'}}, {{'M', 'N'}, {'o', 'P'}}}};
        System.out.println(countLowercaseCharacters(characters));
        System.out.println("17. Return a new 4D array with the same structure, where each string is reversed.");
        String[][][][] texts4D = {{{{"aaA", "bbbbB"}, {"cccccC", "dddddD"}}, {{"eE", "fffff"}, {"ggg", "hhh"}}},
                {{{"iiii", "jjjj"}, {"kkkk", "llll"}}, {{"mmmm", "nnnn"}, {"oo", "pp"}}}};
        System.out.println(Arrays.deepToString(reverseString4DArray(texts4D)));
        System.out.println("18. Return the average length of all strings, rounded down to the nearest integer.");
        System.out.println(calculateAverageStringLength(texts4D));
        System.out.println("19. Return a list of all strings that contain more than two vowels." +
                " (you don’t have to consider non-English vowels, only a, e, i, o and u).");
        System.out.println(getStringsWithMoreThanTwoVowels(texts4D));
        System.out.println("20. Return the shortest string across all dimensions.");
        System.out.println(findShortestStrings(texts4D));
        System.out.println("21. Return the number of strings that do not contain the letters “e”, “E”, or “r”.");
        String[][][][][] texts5D = {{{{{"aaa"}, {"bbb"}}, {{"ccc"}, {"ddd"}}}, {{{"eee"}, {"fff"}}, {{"ggg"}, {"hhh"}}}}, {{{{"AAA"}, {"BBB"}}, {{"CCC"}, {"DDD"}}}, {{{"EEE"}, {"FFF"}}, {{"GGG"}, {"HHH"}}}}};
        System.out.println(countStringsWithoutEorR(texts5D));
        System.out.println("22. Return a new 5D array with all strings replaced by their lengths.");
        System.out.println(Arrays.deepToString(replaceStringsWithLengths(texts5D)));
        System.out.println("23. Return the total number of characters across all strings that start and end with the same letter.");
        System.out.println(countWordsWithSameStartEnd(texts5D));
        System.out.println("24. Return one big string, which is the concatenation of all strings.");
        System.out.println(concatenateAllStrings(texts5D));


    }

    public static boolean isWordsWithSameStartEnd(String text) {
        return (text.charAt(0) == text.charAt(text.length() - 1));
    }

    public static int countWordsWithSameStartEnd(String[][][][][] texts) {
        int sum = 0;
        for (String[][][][] subSubSubarray : texts) {
            for (String[][][] subSubarray : subSubSubarray) {
                for (String[][] subarray : subSubarray) {
                    for (String[] array : subarray) {
                        for (String text : array) {
                            if (isWordsWithSameStartEnd(text)) {
                                sum++;
                            }
                        }
                    }
                }
            }
        }
        return sum;
    }

    public static String concatenateAllStrings(String[][][][][] texts) {
        StringBuilder sb = new StringBuilder();
        for (String[][][][] subSubSubarray : texts) {
            for (String[][][] subSubarray : subSubSubarray) {
                for (String[][] subarray : subSubarray) {
                    for (String[] array : subarray) {
                        for (String text : array) {
                            sb.append(text);
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    public static int[][][][][] replaceStringsWithLengths(String[][][][][] texts5D) {
        int[][][][][] lengthOfStrings = new int[texts5D.length][texts5D[0].length][texts5D[0][0].length][texts5D[0][0][0].length][texts5D[0][0][0][0].length];
        for (int i = 0; i < texts5D.length; i++) {
            for (int j = 0; j < texts5D[i].length; j++) {
                for (int k = 0; k < texts5D[i][j].length; k++) {
                    for (int l = 0; l < texts5D[i][j][k].length; l++) {
                        for (int m = 0; m < texts5D[i][j][k][l].length; m++) {
                            lengthOfStrings[i][j][k][l][m] = texts5D[i][j][k][l][m].length();
                        }
                    }
                }
            }
        }
        return lengthOfStrings;
    }

    public static boolean hasEorR(String text) {
        return (text.contains("E") || text.contains("e") || text.contains("r"));
    }

    public static int countStringsWithoutEorR(String[][][][][] texts) {
        int sum = 0;
        for (String[][][][] subSubSubarray : texts) {
            for (String[][][] subSubarray : subSubSubarray) {
                for (String[][] subarray : subSubarray) {
                    for (String[] array : subarray) {
                        for (String text : array) {
                            if (hasEorR(text)) {
                                sum++;
                            }
                        }
                    }
                }
            }
        }
        return sum;
    }


    public static int findShortestStringLength(String[][][][] texts) {
        int min = Integer.MAX_VALUE;
        for (String[][][] subSubarray : texts) {
            for (String[][] subarray : subSubarray) {
                for (String[] array : subarray) {
                    for (String text : array) {
                        if (text.length() < min) {
                            min = text.length();
                        }
                    }
                }
            }
        }
        return min;
    }

    public static List<String> findShortestStrings(String[][][][] texts) {
        List<String> shortestStrings = new ArrayList<>();
        for (String[][][] subSubarray : texts) {
            for (String[][] subarray : subSubarray) {
                for (String[] array : subarray) {
                    for (String text : array) {
                        if (text.length() == findShortestStringLength(texts)) {
                            shortestStrings.add(text);
                        }
                    }
                }
            }
        }
        return shortestStrings;
    }

    public static int countVowelSumInString(String text) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int sum = 0;
        for (char vowel : vowels) {
            for (char character : text.toLowerCase().toCharArray()) {
                if (character == vowel) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static List<String> getStringsWithMoreThanTwoVowels(String[][][][] texts) {
        List<String> stringsWithMoreThanTwoVowels = new ArrayList<>();
        for (String[][][] subSubarray : texts) {
            for (String[][] subarray : subSubarray) {
                for (String[] array : subarray) {
                    for (String text : array) {
                        if (countVowelSumInString(text) > 2) {
                            stringsWithMoreThanTwoVowels.add(text);
                        }
                    }
                }
            }
        }
        return stringsWithMoreThanTwoVowels;
    }

    public static int calculateAverageStringLength(String[][][][] texts) {
        double sum = 0;
        double stringCount = 0;
        for (String[][][] subSubarray : texts) {
            for (String[][] subarray : subSubarray) {
                for (String[] array : subarray) {
                    for (String text : array) {
                        sum += text.length();
                        stringCount++;
                    }
                }
            }
        }
        double average = sum / stringCount;
        return (int) Math.floor(average);
    }

    public static String[][][][] reverseString4DArray(String[][][][] strings) {
        String[][][][] reverseStrings = new String[strings.length][strings[0].length][strings[0][0].length][strings[0][0][0].length];

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                for (int k = 0; k < strings[i][j].length; k++) {
                    for (int l = 0; l < strings[i][j][k].length; l++) {
                        reverseStrings[i][j][k][l] = new StringBuilder(strings[i][j][k][strings[i][j][k].length - 1 - l]).reverse().toString();
                    }
                }
            }
        }
        return reverseStrings;
    }

    public static int countLowercaseCharacters(char[][][][] characters) {
        int sum = 0;
        for (char[][][] subSubarray : characters) {
            for (char[][] subarray : subSubarray) {
                for (char[] array : subarray) {
                    for (char character : array) {
                        if (character == Character.toLowerCase(character)) {
                            sum++;
                        }
                    }
                }
            }
        }
        return sum;
    }

    public static boolean hasWordEndingWithS(String[] texts) {
        for (String text : texts) {
            if (text.toLowerCase().charAt(text.length() - 1) == 's') {
                return true;
            }
        }
        return false;
    }

    public static boolean hasAllSubarraysContainStringEndingWithS(String[][][] texts) {
        for (String[][] subarray : texts) {
            for (String[] array : subarray) {
                if (!hasWordEndingWithS(array)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int findMaxStringLength(String[][][] texts) {
        int largestStringLength = 0;
        for (String[][] subarray : texts) {
            for (String[] array : subarray) {
                for (String text : array) {
                    if (text.length() > largestStringLength) {
                        largestStringLength = text.length();
                    }
                }
            }
        }
        return largestStringLength;
    }

    public static String concatenateStringsMinLength2(String[][][] texts) {
        StringBuilder concatenatedText = new StringBuilder();
        for (String[][] subarray : texts) {
            for (String[] array : subarray) {
                for (String text : array) {
                    if (text.length() >= 2) {
                        concatenatedText.append(text);
                    }
                }
            }
        }
        return concatenatedText.toString();
    }

    public static int countTotalStringsInThirdLevel(String[][][] texts) {
        int sum = 0;
        for (String[][] subarray : texts) {
            for (String[] array : subarray) {
                sum += array.length;
            }
        }
        return sum;
    }

    public static int[] fillArrayWithStringsLength(String[][][] texts) {
        int[] textsLength = new int[countTotalStringsInThirdLevel(texts)];
        int index = 0;
        for (String[][] subarray : texts) {
            for (String[] array : subarray) {
                for (String text : array) {
                    textsLength[index++] = text.length();
                }
            }
        }
        return textsLength;
    }

    public static String replaceLetter(String word) {
        StringBuilder invertedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            invertedWord.append(word.charAt(i));
        }
        return invertedWord.toString();
    }

    public static int countPalindromeWords(String[][][] texts) {
        int sum = 0;
        for (String[][] subarray : texts) {
            for (String[] array : subarray) {
                for (String text : array) {
                    if (replaceLetter(text).equals(text)) {
                        sum++;
                    }
                }
            }
        }
        return sum;
    }

    public static double countAverageAllCharacters(String[][] texts) {
        int sum = 0;
        int counter = 0;
        for (String[] text : texts) {
            for (String word : text) {
                sum += word.length();
                counter++;
            }
        }
        return (double) sum / counter;
    }

    public static boolean[][] hasNumberInMatrix(String[][] textsAndNumbers) {
        String[] stringNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        boolean[][] booleanTextsAndNumbers = new boolean[textsAndNumbers.length][textsAndNumbers[0].length];
        for (int i = 0; i < textsAndNumbers.length; i++) {
            for (int j = 0; j < textsAndNumbers[i].length; j++) {
                for (String stringNumber : stringNumbers) {
                    if (textsAndNumbers[i][j].contains(stringNumber)) {
                        booleanTextsAndNumbers[i][j] = true;
                        break;
                    }
                }
            }
        }
        return booleanTextsAndNumbers;
    }


    public static int calculateMatrixSize(String[][] texts) {
        int sum = 0;
        for (String[] subtext : texts) {
            sum += subtext.length;
        }
        return sum;
    }

    public static String[] convertToUppercaseArray(String[][] texts) {
        String[] flattenedArrayTexts = new String[calculateMatrixSize(texts)];
        int index = 0;
        for (String[] subtext : texts) {
            for (String text : subtext) {
                flattenedArrayTexts[index++] = text.toUpperCase();
            }
        }
        return flattenedArrayTexts;
    }

    public static int countSumOfNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int countSumLongestStrings(String[][] texts) {
        int longestWord = 0;
        int[] longestWordsSizeInSubtext = new int[texts.length];
        for (int i = 0; i < texts.length; i++) {
            for (int j = 0; j < texts[i].length; j++) {
                if (texts[i][j].length() > longestWord) {
                    longestWordsSizeInSubtext[i] = texts[i][j].length();
                }
            }
        }
        return countSumOfNumbers(longestWordsSizeInSubtext);
    }


    public static int countVowelSumInMatrix(String[][] texts) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int sum = 0;
        for (String[] subtexts : texts) {
            for (String text : subtexts) {
                for (int i = 0; i < text.length(); i++) {
                    for (char vowel : vowels) {
                        if (Character.toLowerCase(text.charAt(i)) == vowel) {
                            sum++;
                        }
                    }
                }
            }
        }
        return sum;
    }

    public static boolean hasConsecutiveDuplicates(int... numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static String concatenateWordsLongerThanThree(List<String> fruits) {
        StringBuilder text = new StringBuilder();
        for (String fruit : fruits) {
            if (fruit.length() > 3) {
                text.append(fruit);
            }
        }
        return text.toString();
    }

    public static int countStringsStartingWithA(List<String> fruits) {
        int counter = 0;
        for (String fruit : fruits) {
            if (Character.toLowerCase(fruit.charAt(0)) == 'a') {
                counter++;
            }
        }
        return counter;
    }

    public static int[] fillArrayWithOddNumbersSquared(int... numbers) {
        int[] oddNumbersSquared = new int[countOddNumbers(numbers)];
        int index = 0;
        for (int number : numbers) {
            if (number % 2 != 0)
                oddNumbersSquared[index++] = number * number;
        }
        return oddNumbersSquared;
    }

    public static int countOddNumbers(int... numbers) {
        int size = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                size++;
            }
        }
        return size;
    }

    public static double countAverage(int... numbers) {
        int sum = 0;
        int size = 0;
        for (int number : numbers) {
            if (number % 2 == 0 && number != 0) {
                sum += number;
                size++;
            }
        }
        return (double) sum / size;
    }
}