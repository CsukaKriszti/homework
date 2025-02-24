package homework_loops;

import java.util.Scanner;


public class Loops_basic_tasks_1_8 {
    public static void main(String[] args) {

        System.out.println("1. Writes “Paper Dragon” to the console 5 times.\n");
        String paperDragon = "Paper Dragon";
        for (int i = 0; i < 5; i++) {
            System.out.println(paperDragon);
        }
        System.out.println();
        System.out.println("2. Writes every integer from 1 to 30 to the console.\n");
        for (int i = 1; i < 31; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("3. Writes every even (divisible by two) value from 1 to 500 to the console.\n");
        int counter = 0;
        for (int i = 1; i < 501; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                counter++;
                if (counter % 20 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n");
        System.out.println("4. Writes every odd (not divisible by two) value from 1 to 500 to the console.\n");
        counter = 0;
        for (int i = 1; i < 500; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                counter++;
                if (counter % 20 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n");
        System.out.println("5. Writes the first 10 powers of two to the console (starting with 2^0 = 1).\n");
        for (int i = 1; i < 513; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("Maybe with a math class :\\");
        for (int i = 0; i < 10; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
        System.out.println("\n");
        System.out.println("6. Writes all the numbers to the console from 565.5 to 678.5 with an increment of 0.25.\n");
        counter = 0;
        for (double i = 565.5; i <= 678.5; i += 0.25) {
            System.out.print(i + " ");
            counter++;
            if (counter % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
        System.out.println("7. Writes all the multiples of 30 to the console between 600 and 750.\n");
        for (int i = 600; i <= 750; i += 30) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("8. Calculates the sum of the first 10 natural numbers and writes it to the console (1+2+…+9+10).\n");
        counter = 0;
        for (int i = 1; i <= 10; i++) {
            counter += i;
        }
        System.out.println(counter);
        System.out.println("\n");
        System.out.println("9. Calculates the average of the first 20 natural numbers and writes it to the console.\n");
        counter = 0;
        for (int i = 1; i <= 20; i++) {
            counter += i;
        }
        double result = (double) counter / 20;
        System.out.println(result);
        System.out.println("\n");
        System.out.println("10. Writes all the square numbers to the console between 1 and 1000.\n");
        for (int i = 1; i * i <= 1000; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println("\n");
        System.out.println("11. Writes all the cube numbers to the console between 1 and 1250.\n");
        for (int i = 1; i * i * i <= 1250; i++) {
            System.out.print(i * i * i + " ");
        }
        System.out.println("\n");
        System.out.println("12. Asks a number from the user and determines if that number is prime\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int examinedNumber = Integer.parseInt(scanner.nextLine());
        scanner.close();
        double number = Math.sqrt(examinedNumber);
        boolean isPrime = true;
        for (int i = 2; i <= number; i++) {
            if (examinedNumber % i == 0) {
                isPrime = false;
                break;

            }
        }
        String text = (isPrime && examinedNumber > 1) ? "prime number" : "not a prime number";
        System.out.println(text);

    }

}