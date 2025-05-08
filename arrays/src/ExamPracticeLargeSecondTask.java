import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamPracticeLargeSecondTask {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(sumEveryFifthElements(getPerfectSquares(returnNumberFromConsole())));
        scanner.close();

    }

    public static int returnNumberFromConsole() {
        int number = 0;
        do {
            System.out.println("Please enter a number between 50 and 10_000:");
            number = scanner.nextInt();
        } while (number < 50 || number > 10_000);
        return number;
    }

    public static List<Integer> getPerfectSquares(int number) {
        List<Integer> perfectSquaresNumbers = new ArrayList<>();
        int index = 1;
        while (index * index < number) {
            perfectSquaresNumbers.add(index * index);
            index++;
        }
        return perfectSquaresNumbers;
    }

    public static int sumEveryFifthElements(List<Integer> numbers) {
        int counter = 0;
        for (int i = 4; i < numbers.size(); i += 5) {
            counter += numbers.get(i);
        }
        return counter;
    }
}