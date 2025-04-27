import java.util.Scanner;

public class KrisztiFirstTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter 6 numbers: ");
        int[] numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = sc.nextInt();
        }
        int sumNumbers = 0;
        for (int number : numbers) {
            sumNumbers += number;
        }
        double average = (double) sumNumbers / numbers.length;
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            if (min < number) {
                min = number;
            }
        }
        for (int number : numbers) {
            if (max > number) {
                max = number;
            }
        }
        double result = (Math.pow(max, min)) - average;
        System.out.println(result);

    }
}