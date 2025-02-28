package homework_loops;

import java.util.Scanner;

public class Loops_basic_tasks_2 {
    public static void main(String[] args) {

        System.out.println("1. Writes Hello, World! to the console 10 times.");
        for (int i = 0; i < 10; i++) {
            System.out.print("Hello, World!" + "\t");
        }
        System.out.println("\n");

        System.out.println("2. Writes every multiple of 5 from 5 to 100 to the console.");
        for (int i = 5; i <= 100; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("3. Writes every multiple of 0.38 from 0.38 to 1162 to the console.");
        for (double i = 0.38; i <= 1162; i += 0.38) {
            System.out.format("%.2f  ",i);
        }
        System.out.println("\n");

        System.out.println("4. Writes every integer between 100 and 1 in reverse order to the console.");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("5. Writes every prime number between 1 and 100 to the console.");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("6. Writes all numbers from -50 to 50 to the console.");
        for (int i = -50; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("7. Writes every number that is a multiple of 7 between 1 and 200 to the console.");
        for (int i = 7 ; i <= 200; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("8. Writes all numbers between 1 and 100 that are divisible by both 3 and 4.");
        for (int i = 1; i <= 100; i++) {
            if (i % 12 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        System.out.println("9. Calculates the sum of all even numbers from 1 to 100 and writes it to the console.");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        System.out.println("10. Calculates the product of all numbers from 1 to 10 and writes it to the console.");
        int sum = 1;
        for (int i = 1; i <= 10; i++) {
            sum *= i;

        }
        System.out.print(sum);
        System.out.println("\n");

        System.out.println("11. Writes all numbers from 1000 to 500, decrementing by 10 each step.");
        for (int i = 1000; i >= 500; i -= 10) {
            System.out.print(i + " ");

        }
        System.out.println("\n");

        System.out.println("12. Writes the square root of every number from 1 to 10 to the console. Note: you can calculate the square root of a number using Math.sqrt()");
        for (int i = 0; i <= 10; i++) {
            System.out.print(Math.sqrt(i)+ "  ");
        }
        System.out.println("\n");

        System.out.println("13. Writes every number from 1 to 500 that is not divisible by 3.");
        for (int i = 0; i <= 500; i++) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        System.out.println("14. Writes every number from 1 to 200 that is neither divisible by 2 nor by 5.");
        for (int i = 1; i <= 200; i++) {
            if (i % 2 != 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        System.out.println("15. Writes every number that is a perfect fourth power up to 10000.");
        for (int i = 1; Math.pow(i, 4) <= 10_000; i++) {
            System.out.print(Math.pow(i, 4) + "  ");
        }
        System.out.println("\n");

        System.out.println("16. Asks for a number and writes whether it is a perfect square or not.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int numberFromConsole = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println(Math.sqrt(numberFromConsole) % 1 == 0 ? "Perfect Square" : "Not a Perfect Square");
        System.out.println();

        System.out.println("17. Finds and writes the largest prime number below 500.");
        int max = 0;
        for (int i = 2; i <= 500; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                max = i;

            }
        }
        System.out.println(max);
        System.out.println();

        System.out.println("18. Writes the sum of all square numbers from 1 to 100.");
        sum = 0;
        for (int i = 1; i * i <= 100; i++) {
            sum += (i * i);

        }
        System.out.println(sum);
    }
}