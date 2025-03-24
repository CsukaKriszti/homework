import java.util.Scanner;

public class SumOfPerfectSquares {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            printSumOfPerfectSquares();
        } finally {
            scanner.close();
        }
        
    }

    public static int getNumberFromConsole() {
        System.out.println("Please enter a number: ");
        return Integer.parseInt(scanner.nextLine());

    }

    public static boolean isValidNumber(int number) {
        return number >= 1;
    }

    public static int countSumOfPerfectSquares(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void printSumOfPerfectSquares() {
        int numberFromConsole = getNumberFromConsole();
        if (isValidNumber(numberFromConsole)) {
            System.out.println(countSumOfPerfectSquares(numberFromConsole));
        } else {
            System.out.println("Wrong input!");
        }
    }

}
