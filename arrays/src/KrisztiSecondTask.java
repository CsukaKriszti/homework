public class KrisztiSecondTask {
    public static void main(String[] args) {
        int[] numbers = {0, 1, -3, 5, -6, 4, 8, -2};
        System.out.println(returnAbsoluteSum(numbers));
    }

    public static int returnAbsoluteSum(int[] numbers) {
        int numberSum = 0;
        for (int number : numbers) {
            numberSum += Math.abs(number);

        }
        return numberSum;
    }
}