import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        scanner = new Scanner();
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        if (number > 5) {
            System.out.println("This number higher than 5 ");
        } else {
            System.out.println("This number not higher than 5 ");
        }


    }
}