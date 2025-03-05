package homework;

import java.math.BigInteger;
import java.util.Arrays;

import static java.lang.Integer.valueOf;

public class MethodsPractice {
    public static void main(String[] args) {
        System.out.println("1. Decides whether a number is greater than 50.");
        int number = 240;
        int number2 = 4;
        int number3 = 2;
        System.out.println(isNumberGreater50(number) + "\n");
        System.out.println("2. Takes in two numbers and returns the greater one.");
        System.out.println(decideGreaterNumber(number, number2) + "\n");
        System.out.println("3. Takes in two numbers and returns a String. Possible values:a.The first number is greater, b.The second number is greater,c.The two numbers are equal");
        System.out.println(displayGreaterNumberText(number, number2) + "\n");
        System.out.println("4. Writes all the numbers from 1 to 100 to the console.");
        printNumbersFrom1To100();
        System.out.println("\n");
        System.out.println("5. Gets in a number as an input parameter and writes all numbers that are divisible by 5 from 1 up to that number.");
        findAndPrintDivisibleBy5(number);
        System.out.println("\n");
        System.out.println("6. Gets in a number and returns whether that number is a prime number.");
        System.out.println(isPrimeNumber(number));
        System.out.println();
        System.out.println("7. Gets in two numbers and returns whether the first is divisible by the second one.");
        System.out.println(isDivisible(number, number2) + "\n");
        System.out.println("8. Gets in three numbers and returns whether the product of the first and second numbers is equal to the third one.");
        System.out.println(isProductEqualToThird(number, number2, number3));
        System.out.println();
        System.out.println("9. Gets in a number (n) and writes the first n cubic numbers to the console. Example: n=3 → Output: 1, 8, 27");
        printFirstNCubes(number);
        System.out.println("\n");
        System.out.println("10. Gets in a number (n) and writes the cubic numbers to the console up to that number. n=64 → Output: 1, 8, 27, 64");
        printCubicNumbersUpTo(number);
        System.out.println("\n");
        System.out.println("11. Gets in an array and a number and returns whether the sum of any two numbers at different indexes can add up to that number.");
        int[] numbers = {5, 6, 10, 2, 4};
        int number4 = 15;
        System.out.println(hasPairWithSum(numbers, number4) + "\n");
        System.out.println("12. Gets in a String and a positive number and returns the String repeated n times. If the number is smaller than 1, return an empty String. Don’t use the string’s in-built repeat method!");
        repeatTextNTimes("Repeat", 5);
        System.out.println("\n");
        System.out.println("13. Gets in an array of Strings and concatenates them into one String.");
        String[] texts = {"If", " I", " always", " do", " tomorrow`s", " work", " today", ",", " the", " last", " day", " of", " my", " life", " will", " be", " totally", " free", "."};
        System.out.println(joinTextArray(texts) + "\n");
        System.out.println("14. Gets in a two-dimensional array and returns the sum of all of the numbers.");
        int[][] matrix = {{1, 3, 2,}, {5, 7, 6}, {8, 9, 7}};
        printMatrixToConsole(matrix);
        System.out.println();
        System.out.println("15. Gets in a two-dimensional array and returns a one-dimensional one with the sum of the subarrays. ");
        int[] array = new int[matrix.length];
        System.out.println(Arrays.toString(sumMatrixRowsAndStoreInArray(matrix, array)) + "\n");
        System.out.println("16. Takes in a 2-d array and returns the sum of its main diagonal- you can be sure that it’s an n*n array:");
        System.out.println(sumMatrixDiagonal(matrix));
        System.out.println(sumMatrixDiagonal2(matrix));
        System.out.println("17. Takes in a 2-d array and returns its diagonal difference, so in the case of the previous array, it should return (1+0+3+2)-(1+0+2+2)");
        System.out.println(calculateDiagonalSums(matrix));
        System.out.println(calculateDiagonalSums2(matrix));

    }

    private static int calculateDiagonalSums(int[][] matrix) {
        int diagonalSum = sumMatrixDiagonal(matrix);
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == matrix.length - 1) {
                    counter += matrix[i][j];
                }
            }
        }
        return diagonalSum + counter;
    }

    private static int calculateDiagonalSums2(int[][] matrix) {
        int diagonalSum2 = sumMatrixDiagonal(matrix);
        int counter = 0;
        int lastNumberIndex = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            if (i >= 0) {
                counter += matrix[i][lastNumberIndex--];
            }

        }
        return counter + diagonalSum2;
    }

    private static int sumMatrixDiagonal(int[][] matrix) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    counter += matrix[i][j];
                }
            }
        }


        return counter;
    }

    private static int sumMatrixDiagonal2(int[][] matrix) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            counter += matrix[i][i];
        }
        return counter;
    }

    private static int[] sumMatrixRowsAndStoreInArray(int[][] matrix, int[] array) {
        for (int i = 0; i < matrix.length; i++) {
            int counter = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                counter += matrix[i][j];
            }
            array[i] = counter;
        }


        return array;
    }


    private static void printMatrixToConsole(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

    private static String joinTextArray(String[] texts) {
        StringBuilder newTexts = new StringBuilder();
        for (String text : texts) {
            newTexts.append(text);
        }
        return newTexts.toString();
    }

    private static void repeatTextNTimes(String text, int number) {
        if (number < 1) {
            String empty = "";
            System.out.println(empty);
        }
        for (int i = 0; i < number; i++) {
            System.out.print(text + " ");
        }

    }

    private static boolean hasPairWithSum(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] + numbers[j]) == number) {
                    return true;
                }
            }

        }

        return false;
    }


    private static void printCubicNumbersUpTo(int number) {
        for (int i = 1; i * i * i <= number; i++) {
            System.out.print((int) Math.pow(i, 3) + " ");

        }
    }

    private static void printFirstNCubes(int number) {
        for (int i = 1; i <= 3; i++) {
            BigInteger value = BigInteger.valueOf(i);
            BigInteger powerValue = value.pow(number);
            System.out.print(powerValue + " ");
        }
    }

    private static boolean isProductEqualToThird(int number, int number2, int number3) {
        return number * number2 == number3;
    }

    private static boolean isDivisible(int numberToBeDivided, int divisor) {
        return numberToBeDivided % divisor == 0;
    }

    private static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    private static void findAndPrintDivisibleBy5(int number) {
        if (number > 5) {
            for (int i = 1; i < number; i++) {
                if (i % 5 == 0) {
                    System.out.print(i + " ");
                }

            }
        } else {
            System.out.println("The number is not greater than 5.");
        }
    }

    private static void printNumbersFrom1To100() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    private static String displayGreaterNumberText(int number, int number2) {
        return number > number2 ? "The first number is greater." : number2 > number ? "The second number is greater." : "The two numbers are equal.";
    }

    private static int decideGreaterNumber(int number, int number2) {
        return Math.max(number2, number);
    }

    private static boolean isNumberGreater50(int number) {
        return number > 50;
    }

}

