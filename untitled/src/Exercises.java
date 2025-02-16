import java.util.Scanner;

public class Exercises {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("13.feladat : \n");
        System.out.println("Please enter 3 numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber + "," + secondNumber + "," + thirdNumber + " --> The first number is the greatest");
        } else if (secondNumber > thirdNumber && secondNumber > firstNumber) {
            System.out.println(firstNumber + "," + secondNumber + "," + firstNumber + " --> The second number is the greatest");
        } else {
            System.out.println(firstNumber + "," + secondNumber + "," + thirdNumber + " --> The third number is the greatest");
        }if(firstNumber == secondNumber && firstNumber == thirdNumber){
            System.out.println("all three numbers are equal");
        }
    }
}