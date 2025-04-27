import java.util.Scanner;

public class KrisztiFifthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
    public static int returnNumberFromConsole(){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Please enter a number between 10 and 1_000_000:");
            number = sc.nextInt();
        } while (number < 10 || number > 1_000_000);
        return number;
    }

}
