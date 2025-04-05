import java.util.Arrays;

public class MethodsPractice {
    public static void main(String[] args) {
        System.out.println("Write a method that, gets in a String and returns it's length");
        String text = "alma";
        System.out.println(text + ": " + (getLength(text)));
        System.out.println("Write a method that, gets in an intiger it's double");
        System.out.println(multiplyByTwo(10));
        System.out.println("Write a method that, gets in an intiger and returns it's factorial");
        System.out.println(calculateFactorial(5));
        System.out.println("Write a method that, gets in a number and returns it's cube");
        System.out.println(calculateCube(5));
        System.out.println("Write a method that, gets in an array of booleans and returns a boolean with the value of A" +
                "a1 && a2 && ... && an");
        boolean[] array = {true, true, false};
        System.out.println(isTrue(array));
        System.out.println("Write a method that, gets in an array of numbers with" +
                " a new array with all of its elements at even indexes");
        int[] numbers = {11,12,55,68,43,34};
        System.out.println(Arrays.toString(getElementsInEvenIndex(numbers)));
        System.out.println("Write a method that, gets in an array of numbers" +
                " and returns with a new array with all of it's elements at odd indexes.");

    }

    public static int[] getElementsInEvenIndex(int[] numbers) {
        int size = (numbers.length + 1) / 2;
        int[] result = new int[size];
        for (int i = 0, j = 0; i < numbers.length && j < result.length; i += 2, j++) {
            result[j]= numbers[i];
        }
        return result;
    }

    public static boolean isTrue(boolean[] array) {
        boolean result = true;
        for (boolean item : array) {
            result &= item;
            // result = result && item;
        }
        return result;
    }

    public static int calculateCube(int number) {
        return number * number * number;
    }

    public static int calculateFactorial(int number) {
        int factrorial = 1;
        for (int i = 1; i <= number; i++) {
            factrorial *= i;
        }
        return factrorial;
    }

    public static int multiplyByTwo(int number) {
        return number * 2;
    }

    public static int getLength(String text) {
        return text.length();
    }


}
