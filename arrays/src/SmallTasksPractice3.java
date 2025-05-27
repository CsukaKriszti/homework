import java.util.Arrays;

public class SmallTasksPractice3 {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 9, 3, 7, 9, 2, 5, 9, 4, 7, 3, 2, 1, 9};
        System.out.println(getMode(numbers));
    }

    public static int getMode(int[] numbers) {
        Arrays.sort(numbers);
        int initialValue = numbers[0];
        int counter = 1;
        int currentCounter = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                currentCounter++;
            }
            if (currentCounter > counter) {
                counter = currentCounter;
                initialValue = numbers[i - 1];
            }
            if (numbers[i] != numbers[i - 1]) {
                currentCounter = 1;
            }
        }
        return initialValue;
    }

    public static int getMedian(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        return length % 2 == 0 ? (numbers[length / 2] + numbers[(length / 2) - 1]) / 2 : numbers[length / 2];
    }

    public static double calculateModeMedianPower(int[] numbers) {
        int mode = getMode(numbers);
        int median = getMedian(numbers);
        return Math.pow(mode, median);
    }
}