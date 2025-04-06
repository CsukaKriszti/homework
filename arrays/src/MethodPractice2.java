import java.util.Arrays;
import java.util.Scanner;

public class MethodPractice2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Writes your own name to the console");
        writesNameToConsole();
        scanner.close();
        System.out.println("2. Writes a welcome message to the console");
        writesWelcomeMessageToConsole();
        System.out.println("3. Gets in a number and returns its 30%");
        System.out.println(calculateThirtyPercent(100));
        System.out.println("4. Gets in an array of Strings and returns an empty String");
        System.out.println("This doesn't make sense.");
        System.out.println("5. Gets in a number and returns its 42.8%");
        System.out.println(calculateWeirdPercent(100));
        System.out.println("6. Gets in a String and returns the double of its length");
        System.out.println(calculateStringLengthDouble("cherry"));
        System.out.println("7. Gets in two numbers and returns how much you would need to add to the first number to get the second one");
        System.out.println(calculateDifference(30, 10));
        System.out.println("8. Gets in a String and returns the square root of its length");
        System.out.println(calculateRootOfLength("orange"));
        System.out.println("9. Gets in a String and returns the factorial of its length");
        System.out.println(calculateStringLengthFactorial("lemon"));
        System.out.println("10. Gets in a number and returns 100 divided by that number");
        System.out.println(calculateHundredReciprocal(50));
        System.out.println("11.a Gets in a number and returns the square of it if it is prime");
        System.out.println(calculateSquareIfPrime(45));
        System.out.println("11.b Gets in a number and returns the double of it if it is not a prime and is divisible by 4");
        System.out.println(calculateDoubleIfDivisibleByFourAndNotPrime(44));
        System.out.println("11.c Gets in a number and returns the triple of it if it is not a prime and is not divisible by 4");
        System.out.println(calculateTripleIfNotPrimeAndNotDivisibleByFour(9));
        System.out.println("12. Gets in an array of Strings and returns a new array of numbers of each String’s length");
        System.out.println(Arrays.toString(convertStringsToLengths("apple", "pear", "cherry")));
        System.out.println("13. Gets in a gross salary and calculates the net salary according to the Hungarian rules in the following way:" +
                "deduces 15% as SZJA (personal income tax) and 18.5% as TBJ (social security tax)");
        System.out.println(calculateHungarianNetSalary(850_000));
        System.out.println("14. Gets in an array of booleans and returns a1 XOR a2 XOR a3 … XOR an");
        boolean[] booleanArray = {false, true, false, true};
        System.out.println(calculateXorForBooleans(booleanArray));
        System.out.println("Gets in an array of numbers and returns a new array with all the negative numbers in from the original array");
        int[] numbers = {4, 63, -34, -54, 2, 78, -11};
        System.out.println(Arrays.toString(filterNegativeValues(numbers)));
    }

    public static int[] filterNegativeValues(int... numbers) {
        int counter = getCounter(numbers);
        int[] negativeNumbers = new int[counter];
        int index = 0;
        for (int number : numbers) {
            if (number < 0) {
                negativeNumbers[index++] = number;
            }
        }
        return negativeNumbers;
    }

    public static int getCounter(int... numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (number < 0) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean calculateXorForBooleans(boolean[] array) {
        boolean result = false;
        for (boolean item : array) {
            result ^= item;
        }
        return result;
    }

    public static double calculateSocialSecurityTax(int number) {
        return (double) number * 0.185;
    }

    public static double calculatePersonalIncomeTax(int number) {
        return (double) number * 0.15;
    }

    public static double calculateHungarianNetSalary(int number) {
        return (double) number - calculateSocialSecurityTax(number) - calculatePersonalIncomeTax(number);
    }

    public static int[] convertStringsToLengths(String... text) {
        int[] length = new int[text.length];
        for (int i = 0, j = 0; i < text.length; i++, j++) {
            length[j] = text[i].length();
        }
        return length;
    }

    public static int calculateTripleIfNotPrimeAndNotDivisibleByFour(int number) {
        return (!isPrimeNumber(number) && number % 4 != 0) ? number * 3 : -1;
    }

    public static int calculateDoubleIfDivisibleByFourAndNotPrime(int number) {
        return (!isPrimeNumber(number) && number % 4 == 0) ? number * 2 : -1;
    }

    public static int calculateSquareIfPrime(int number) {
        return isPrimeNumber(number) ? number * number : -1;
    }

    public static boolean isPrimeNumber(int number) {
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

    public static double calculateHundredReciprocal(int number) {
        if (number == 0) {
            return 0;
        }
        return (double) 100 / number;
    }

    public static int calculateStringLengthFactorial(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        int textLengthFactorial = 1;
        for (int i = 1; i <= text.length(); i++) {
            textLengthFactorial *= i;
        }
        return textLengthFactorial;
    }

    public static double calculateRootOfLength(String text) {
        return Math.sqrt(text.length());
    }

    public static int calculateDifference(int firstNumber, int secondNumber) {
        return secondNumber - firstNumber;
    }

    public static int calculateStringLengthDouble(String text) {
        return text.length() * 2;
    }

    public static double calculateWeirdPercent(int number) {
        return (number * 0.428);
    }

    public static double calculateThirtyPercent(int number) {
        return (number * 0.30);
    }

    public static void writesWelcomeMessageToConsole() {
        System.out.println("Welcome");
    }

    public static void writesNameToConsole() {
        System.out.print("please enter your name: ");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
