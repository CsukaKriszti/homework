import java.util.Scanner;

public class HeavenlyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number %2 == 0 && number <100 && number %7 !=0) {
            System.out.println("Heavenly number");
        } else if (number > 300 && number %13 == 0 ) {
            System.out.println("Heavenly number");
        } else {
            System.out.println("Not heavenly number");
        }
    }
}
