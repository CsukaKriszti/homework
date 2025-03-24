import java.util.Arrays;

public class StrongNumbers {
    public static void main(String[] args) {
        System.out.println(isValidFactorialNumber(146));
    }


    public static int[] splitNumberIntoDigits(int number) {
        String stringNumber = String.valueOf(number);
        int[] numbers = new int[stringNumber.length()];
        for (int i = 0; i < stringNumber.length(); i++) {
            numbers[i] = Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
        }
        return numbers;
    }
    public static int calculateFactorial(int number){
        int[] factorials = {1,1,2,6,24,120,720,5040,40320,362880};
        return factorials[number];
    }

    //public static int calculateFactorial(int number) {
    //    int result = 1;
    //    for (int i = 1; i <= number; i++) {
    //        result *= i;
    //    }
    //    return result;
    //}

    public static int[] convertDigitsToFactorials(int number) {
        int[] numbers = splitNumberIntoDigits(number);
        int[] factorialNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            factorialNumbers[i] = calculateFactorial(numbers[i]);
        }
        return factorialNumbers;
    }

    public static int calculateSum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static int calculateFactorialSum(int number) {
        int[] factorialNumbers = convertDigitsToFactorials(number);
        return calculateSum(factorialNumbers);

    }

    public static boolean isValidFactorialNumber(int number) {
        return calculateFactorialSum(number) == number;
    }
}
