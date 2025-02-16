import java.math.BigDecimal;
import java.util.Scanner;

public class SmallTasks {
    public static void main(String[] args) {
        System.out.println("1. feladat:");
        System.out.println("""
                           Deklarál két double típusú változót, amiknek a következő az értéke: 0,1 és 0,2
                           Létrehoz egy új double típusú változót, amibe az előző két szám összegét tárolja, majd kiírja ezt az értéket a konzolra.
                           """);
        //double precisions problems
        //double 64 bit
        double firstDoubleNumber = 0.1;
        double secondDoubleNumber = 0.2;
        double sum = firstDoubleNumber + secondDoubleNumber;
        System.out.println(sum);
        //0.30000000000000004
        //BigDecimal()
        BigDecimal correctedSum = BigDecimal.valueOf(firstDoubleNumber).add(BigDecimal.valueOf(secondDoubleNumber));
        System.out.println(correctedSum);
        System.out.println();

        System.out.println(Long.MAX_VALUE);//9223372036854775807
        System.out.println(Long.MIN_VALUE);//-9223372036854775808
        //2^64 / 2 -1
        //2^63 - 1
        System.out.println();
        System.out.println("2. feladat:");
        System.out.println("Bekér a felhasználótól három egész számot, és kiírja, hogy a három szám összege egyenlő-e 180-nal.");
        System.out.println("Please enter 3 numbers:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        if (firstNumber+secondNumber+thirdNumber == 180) {
            System.out.println("The sum is equal to 180");
        } else if (firstNumber+secondNumber+thirdNumber > 180) {
            System.out.println("The sum is greater than 180");
        } else {
            System.out.println("The sum is less than 180");
        }
        System.out.println();
        System.out.println("3. feladat:");
        System.out.println("Bekér a felhasználótól egy egész számot, és kiírja, hogy az adott szám pozitív, nulla vagy negatív.");
        System.out.println("Please enter a number: ");
        int numberFromConsole = scanner.nextInt();
        if (numberFromConsole > 0) {
            System.out.println("The number is positive");
        } else if (numberFromConsole < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
        System.out.println("4. feladat:");
        System.out.println("Bekér a felhasználótól négy egész számot, és kiírja, hogy az első három szám összege egyenlő-e a negyedik értékkel.");
        System.out.println("Please enter 4 numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int sum1 = number1+number2+number3;
        if(sum1 == number4){
            System.out.println("The sum of the first 3 numbers is equal to " + number4);
        }else {
            System.out.println("The sum of the first 3 numbers is not equal to " + number4);
        }
        System.out.println();
        System.out.println("5. feladat");
        System.out.println("Bekér a felhasználótól egy egész számot, és kiírja, hogy az adott szám kisebb, nagyobb vagy egyenlő 80-nal.");
        System.out.println("Please enter a number: ");
        int number5 = scanner.nextInt();
        if (number5 > 80) {
            System.out.println("The number is bigger than 80");
        } else if (number5 < 80) {
            System.out.println("The number is less than 80");
        } else {
            System.out.println("The number is equal to 80");
        }
        System.out.println();
        System.out.println("6. feladat");
        System.out.println("Bekér a felhasználótól egy egész számot, és kiírja, hogy az adott szám osztható-e 7-tel.");
        System.out.println("Please enter a number");
        int number7 = scanner.nextInt();
        if(number7 %7 == 0){
            System.out.println("This number is divisible 7");
        }else {
            System.out.println("This number is not divisible 7");
        }
        System.out.println();
        System.out.println("7. feladat");
        System.out.println("Bekér a felhasználótól egy lebegőpontos számot, és kíirja, hogy a szám hatszorosa nagyobb-e száznál.");
        System.out.println("Pleas enter a fractional number: ");
        double number20 = scanner.nextDouble();
        scanner.nextLine();

        if(number20 *6 > 100){
            System.out.println("Six times the number is greater than 100");
        }else {
            System.out.println("Six times the number is not greater than 100");
        }
        System.out.println();
        System.out.println("8. feladat");
        System.out.println("Bekér a felhasználótól egy szöveget, és kiírja a szöveg hosszát. Tipp: a hossz megállapításához használd a String length() metódusát.");
        System.out.println("Please enter a text: ");
        String text = scanner.nextLine();
        System.out.println("The text length is: "+ text.length());
        System.out.println();
        System.out.println("9. feladat");
        System.out.println("Bekér a felhasználótól két szöveget, és kiírja a konzolra a két szöveg karakterszámainak az összegét.");
        System.out.println("Please enter 2 texts: ");
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        System.out.println(text1.length()+text2.length());
        System.out.println();
        System.out.println("10. feladat");
        System.out.println("Bekér a felhasználótól két lebegőpontos számot, és kiírja, hogy a két szám közül melyik a nagyobb.");
        System.out.println("Please enter two fractional numbers");
        double number10 = scanner.nextDouble();
        double number11 = scanner.nextDouble();
        scanner.nextLine();
        if(number10 > number11){
            System.out.println("The first number is greater");
        }else if(number10 < number11) {
            System.out.println("The second number is greater");
        }else {
            System.out.println("The two numbers are equal");
        }
        System.out.println();
        System.out.println("11. feladat");
        System.out.println("Bekér a felhasználótól egy szöveget és egy egész számot, és kiírja, hogy a szöveg hossza-e a nagyobb vagy a szám.");
        System.out.println("Please enter a text and a number: ");
        String text10 = scanner.nextLine();
        int number12 = scanner.nextInt();
        scanner.nextLine();
        if (text2.length() > number12){
            System.out.println("The text length is grater "+ number12);
        } else if (text2.length() < number12) {
            System.out.println("The text length is not grater "+ number12);
        } else {
            System.out.println("The text length is equal to "+ number12);
        }
        System.out.println();
        System.out.println("12. feladat");
        System.out.println("Bekér a felhasználótól 3 egész számot, és kiírja, hogy a három közül melyik érték a legnagyobb.");
        System.out.println("Please enter 3 numbers:");
        int number13 = scanner.nextInt();
        int number14 = scanner.nextInt();
        int number15 = scanner.nextInt();
        scanner.nextLine();
        if (number13 >= number14 && number13 >= number15) {
            System.out.println("The first number is the greatest");
        } else if (number14 >= number13 && number14 >= number15) {
            System.out.println("The second number is the greatest");
        } else {
            System.out.println("The third number is the greatest");
        }
        System.out.println();
        System.out.println("13. feladat");
        System.out.println("Bekér a felhasználótól 3 egész számot, és kiírja, hogy a három közül hányadik érték a legnagyobb. " +
                "Ha a legnagyobb érték több helyen is szerepel, akkor mindegyik sorszámnevet írd ki! ");
        System.out.println("Please enter 3 numbers: ");
        int number16 = scanner.nextInt();
        int number17 = scanner.nextInt();
        int number18 = scanner.nextInt();
        if (number16 > number17 && number16 > number18) {
            System.out.println("The first number is the greatest");
        } else if (number17 > number16 && number17 > number18) {
            System.out.println("The second number is the greatest");
        } else if (number18 > number17 && number18 > number16) {
            System.out.println("The third number is the greatest");
        } else if (number16 == number17 && number16 > number18) {
            System.out.println("The first and the second numbers are the greatest");
        } else if (number16 == number18 && number16 > number17) {
            System.out.println("The first and the third numbers are the greatest");
        } else if (number17 > number16) {
            System.out.println("The second and the third numbers are the greatest");
        } else {
            System.out.println("All three numbers are equal");
        }

    }

}
