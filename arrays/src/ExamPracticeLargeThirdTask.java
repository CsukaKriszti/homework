import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamPracticeLargeThirdTask {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(getTribonacciNumbers(getUserInput(), 10));
    }

    public static List<Integer> getUserInput() {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Please enter 3 numbers: ");
        for (int i = 0; i < 3; i++) {
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }

    public static List<Integer> getTribonacciNumbers(List<Integer> numbers, int size) {
        for (int i = 0; i < size; i++) {
            numbers.add(numbers.get(i) + numbers.get(i + 1) + numbers.get(i + 2));
        }
        return numbers;
    }
}