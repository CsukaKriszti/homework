import java.util.*;

public class ExamPracticeSmallTasks {
    public static void main(String[] args) {
        int[] numbers = {12, -2, 3, 6, 8, 3};
        System.out.println(isPerfectSquaresAndEvenNumbers());
        System.out.println(getSqrtOfMaxMinDifference());
        System.out.println(getSumDifferenceOfOddEven());
        System.out.println(findMaxDifference(numbers));
    }

    public static List<Integer> getFiveNumbersFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 numbers: ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(sc.nextInt());
        }
        return numbers;
    }

    public static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static List<Boolean> isPerfectSquaresAndEvenNumbers() {
        List<Integer> numbers = getFiveNumbersFromUser();
        List<Boolean> result = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0 && isPerfectSquare(number)) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public static List<Integer> getSixNumbersFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 6 numbers: ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            numbers.add(sc.nextInt());
        }
        return numbers;
    }

    public static int getSqrtOfMaxMinDifference() {
        List<Integer> numbers = getSixNumbersFromUser();
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        return (int) Math.sqrt(max - min);
    }

    public static int getSumDifferenceOfOddEven() {
        List<Integer> numbers = getSixNumbersFromUser();
        int sumOfOddNumbers = 0;
        int sumOfEvenNumbers = 0;
        for (int number : numbers) {
            sumOfEvenNumbers += (number % 2 == 0) ? number : 0;
            sumOfOddNumbers += (number % 2 != 0) ? number : 0;
        }
        return sumOfOddNumbers - sumOfEvenNumbers;
    }

    public static int findMaxDifference(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        return max - min;
    }
}