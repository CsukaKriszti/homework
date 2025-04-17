import java.util.Arrays;

public class AlgorithmicPractice {
    public static void main(String[] args) {
        System.out.println(determineGreatestCommonDivisor(48, 18));
        System.out.println(getReversedNumber(1000));
        System.out.println(compressText("aaaabbbbbcccccdddddd"));
        System.out.println(isPalindrome("rotor"));
    }

    public static boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return reversed.equals(text);
    }

    public static String compressText(String strangeTexts) {
        int counter = 0;
        StringBuilder compressedText = new StringBuilder();
        compressedText.append(strangeTexts.charAt(0));
        for (int i = 1; i < strangeTexts.length(); i++) {
            if (strangeTexts.charAt(i) == strangeTexts.charAt(i - 1)) {
                counter++;
            } else {
                compressedText.append(counter);
                compressedText.append(strangeTexts.charAt(i));
                counter = 0;
            }
        }
        return compressedText.append(counter).toString();
    }

    public static int getReversedNumber(int number) {
        String stringNumber = String.valueOf(number);
        String reversedStringNumber = new StringBuilder(stringNumber).reverse().toString();
        if (number < 0) {
            String stringNegativeNumber = '-' + reversedStringNumber.substring(0, reversedStringNumber.length() - 1);
            return Integer.parseInt(stringNegativeNumber);
        } else {
            return Integer.parseInt(reversedStringNumber);
        }
    }

    public static int determineGreatestCommonDivisor(int firstNumber, int secondNumber) {
        while (secondNumber > 0) {
            int rest = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = rest;
        }
        return firstNumber;
    }
}