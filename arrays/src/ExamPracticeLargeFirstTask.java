import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamPracticeLargeFirstTask {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(sumEverySecondElements(getFactorialNumbers(returnNumberFromConsole())));
        scanner.close();

    }

    public static int returnNumberFromConsole() {
        int number = 0;
        do {
            System.out.println("Please enter a number between 20 and 1_000_000:");
            number = scanner.nextInt();
        } while (number < 20 || number > 1_000_000);
        return number;
    }

    public static List<Integer> getFactorialNumbers(int number) {
        List<Integer> factorials = new ArrayList<>();
        int factorialNumber = 1;
        int index = 1;
        while (factorialNumber < number) {
            factorials.add(factorialNumber);
            factorialNumber *= index;
            index++;
        }
        return factorials;
    }

    public static int sumEverySecondElements(List<Integer> numbers) {
        int counter = 0;
        for (int i = 1; i < numbers.size(); i += 2) {
            counter += numbers.get(i);
        }
        return counter;
    }
}