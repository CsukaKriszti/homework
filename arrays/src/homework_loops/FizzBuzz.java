package homework_loops;

import java.util.Scanner;


public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Please enter a number: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number <= 0) {
                System.out.println("The number must be greater than 0.");
            }
        } while (number <= 0);
        scanner.close();
        for (int i = 0; i < number + 1; i++) {
            String text = (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" : (i % 3 == 0) ? "Fizz" : (i % 5 == 0) ? "Buzz" : String.valueOf(i);
            System.out.println(text);
        }
    }
}