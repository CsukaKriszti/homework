import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {1, 5, 9, 11, 17, 28, 30, 31, 45, 78};
        int target = 30;
        int result = binarySearch(numbers , target);
    }
    public static int binarySearch(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int middle = (right + left) / 2;

            if (numbers[middle] == target) {
                return middle;
            }
            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
