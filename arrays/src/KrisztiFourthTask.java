public class KrisztiFourthTask {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7};
        System.out.println(countStrangenumbers(numbers));
    }

    // (-1) * 1 + 1 * 2 + 0 * 3 + (-1) * 4 = -1 + 2 -4 = -3
    public static int countStrangenumbers(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 3 == 0) {
                sum -= numbers[i];
            }
            if (i % 3 == 1) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}