package homework_loops;

import java.util.Scanner;

public class First_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.print("Please enter a text: ");
        String text = scanner.nextLine();
        if (number < 0) {
            System.out.println("The number is less than zero.");
        } else {
            for (int i = 0; i < number; i++) {
                System.out.println(text);
            }
        }
        scanner.close();

    }
}
