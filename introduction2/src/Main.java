import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    static int saticFieldExample; // osztály szintű változó (Main osztályonként van egy ilyen)
    int instanceFieldExample; // pédány szintű változó (Main példányonként van egy ilyen)

    public static void main(String[] args) { // agrs - paraméter változó
        System.out.println("Hello and welcome!");
            int localVariableExanple = 0; // lokális/helyi  változó
        //Scanner = osztály
        //scanner = egy konkrét példány
        Scanner scanner = new Scanner(System.in);

        System.out.println("Írj be egy számot: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println(number);
        System.out.println();

        String szoveg = "Ez egy szöveg ";
        // Rámegyek a Stringre és nyomok egy ctrl-t és megtudom nézni mi az a String
        System.out.println(szoveg.repeat(number));
        //Kiírja annyiszor azt, hogy "Ez egy szöveg " amennyi a number értéke.
        System.out.println();
        String text = "--*--";
        System.out.println(text.repeat(number));
        System.out.println();
        System.out.printf("%30s ide azt írok amit akarok %s","HELLO", "WORLD");
        //                         HELLO ide azt írok amit akarok WORLD
        //                         HELLO- ez a távolság itt 30 karakter a HELLO szó utolsó betüjéig
        System.out.println();
        System.out.printf("%-30s ide azt írok amit akarok %s", "HELLO", "WORLD");
        //HELLO                          ide azt írok amit akarok WORLD
        //HELLO                          - ez a távolság itt 30 karakter a HELLO szó első betüjétől
        System.out.println();
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.println("The length of your name is " + name.length());
        System.out.printf("The length of your name is %d%n" , name.length());
        //if statements
        if (true){
            System.out.println("This always gets written to the console.");
        }
        if(false){
            System.out.println("This never gets written to the console.");
        }
        if (name.length() > 9) {
            System.out.println("Your name is long.");
        }else {
            System.out.println("Your name is short.");
        }
        System.out.println();
        boolean isNameLong = name.length() > 9;
        if (isNameLong) {
            System.out.println("Your name is long.");
        }else {
            System.out.println("Your name is short.");
        }
        System.out.println();
        //a keret hossza a leghosszabb String-hez igazodjon
        String email = "valaki@gmail.com";
        if (name.length() > email.length()  ) {
            System.out.println(text.repeat(name.length()));
        }  else {
            System.out.println(text.repeat(email.length()));
        }
        System.out.println();
        String divider;
        if (name.length() > email.length()  ) {
            int lineLength = name.length();
            divider = text.repeat(lineLength);
        }  else {
            int lineLength = email.length();
            divider = text.repeat(lineLength);
        }
        System.out.println(divider);
        System.out.println();
        //Kérj be a felhasználótól egy számot.
        //Ha ez a szám nagyobb, mint 5, írd ki, hogy a szám nagyobb, mint 5
        //Ha nem nagyobb, mint 5, írd ki, hogy nem nagyobb, mint 5
        System.out.println("Please enter a number: ");
        int numberFromConsol = scanner.nextInt();
        scanner.nextLine();
        if (numberFromConsol > 5){
            System.out.println("This number over than  5");
        } else {
            System.out.println("this number not bigger than 5");
        }
        System.out.println();
        //double precisions problems
        //double 64 bit
        double firstNumber = 0.1;
        double secondNumber = 0.2;
        double sum = firstNumber + secondNumber;
        System.out.println(sum);
        //0.30000000000000004
        BigDecimal correctedSum = BigDecimal.valueOf(firstNumber).add(BigDecimal.valueOf(secondNumber));
        System.out.println(correctedSum);
        //0.3






    }
}