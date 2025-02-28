package homework_loops;

public class Alternating_calculations {
    public static void main(String[] args) {

        System.out.println("1. n1+n2−n3+n4+n5−n6+n7+n8−n9");
        int[] numbers = {5, 2, 1, 3, 4, 2, 4, 1, 2, 1};
        int sumOfAdditionAndSubtraction = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((i + 1) % 3 == 0) {
                sumOfAdditionAndSubtraction -= numbers[i];
            } else {
                sumOfAdditionAndSubtraction += numbers[i];
            }
        }
        System.out.println(sumOfAdditionAndSubtraction);
        System.out.println();
        System.out.println("2. n1×n2÷n3×n4×n5÷n6×n7×n8÷n9…");
        double sumOfMultiplicationAndDivision = 1;
        for (int i = 0; i < numbers.length; i++) {
            sumOfMultiplicationAndDivision = (((i + 1) % 3 == 0) ? sumOfMultiplicationAndDivision / numbers[i] : sumOfMultiplicationAndDivision * numbers[i]);
        }
        System.out.println(sumOfMultiplicationAndDivision);
        System.out.println();

        System.out.println("3. n0−n1+n2−n3+n4−n5+…");
        int sumOfAdditionAndSubtraction2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumOfAdditionAndSubtraction2 = ((i % 2 == 0) ? sumOfAdditionAndSubtraction2 + numbers[i] : sumOfAdditionAndSubtraction2 - numbers[i]);
        }
        System.out.println(sumOfAdditionAndSubtraction2);
        System.out.println();

        System.out.println("4. Compute the sum while skipping every fourth element (index 3, 7, 11, etc.).");
        int sumOfTheAddition = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumOfTheAddition = (!((i + 1) % 4 == 0) ? sumOfTheAddition + numbers[i] : sumOfTheAddition);
        }
        System.out.println(sumOfTheAddition);
        System.out.println();

        System.out.println("5. n1^n2÷n3^n4×n5^n6÷n7^n8×n9^n10");
        //int[] numbers = {5, 2, 1, 3, 4, 2, 4, 1, 2, 1};
        System.out.println(Math.pow(5, 2) / Math.pow(1, 3) * Math.pow(4, 2) / Math.pow(4, 1) * Math.pow(2, 1));
        double strangeSum = 1; //25, 25, 400, 100, 200
        for (int i = 0; i < numbers.length - 1; i += 2) { // i:  0, 2, 4, 6, 8
            double partResult = Math.pow(numbers[i], numbers[i + 1]); // 25, 1, 16, 4, 2
            if (i % 4 == 0) {
                strangeSum *= partResult;
            } else {
                strangeSum /= partResult;
            }
        }
        System.out.println(strangeSum);
        System.out.println();

        // kettesével léptetve az utolsó előtti számig megy a ciklus ezért a tömb hossza -1 ig azaz a 8. indexig megy, mert a 9. indexen lévő számot nem vizsgáljuk mivel minden 2.-at vizsgáljuk

        // 1. futás:
        // i értéke 0
        // a tömb 0. indexén lévő szám ami itt az 5 a tömb 1. indexén lévő szám hatványára emeli ami itt a 2
        // így lesz a partResult értéke 5*5= 25
        // utána megvizsgálja, az if ágat, hogy i értéke ami itt még 0, ha elosztja 4-gyel a maradéka 0-e
        // mivel 0 osztva 4-gyel az 0 így ez IGAZ
        // ezért a strangeSum nevű változóm, aminek az elején adtam egy kezdő értéket ami 1 volt itt egyenlő lesz (strangeSum*partResault) 1*25-tel
        // igy strangeSum értéke 25 lett
        // nem ugrik át az else ágba


        // 2. futás:
        // mivel a léptetés (i += 2 azaz i = i+2) ezért
        // a tömb 2. indexén lévő számot (és nem a 0. index után az 1. indexet) nézi, ami itt 1 a tömb 4. indexén lévő szám hatványára emeli ami itt 3
        // így lesz a partResult értéke 1*1*1 = 1
        // utána megvizsgálja, az if ágat, hogy i értéke ami itt már 2(mivel kettesével léptet), ha elosztom 4-gyel a maradéka 0 lesz-e
        // mivel 2 osztva 4-gyel az 0.5 így ez HAMIS lesz és átugrik az else ágba
        // így strangeSum változó ami most még 25 az egyenlő lesz (strangeSum/partResult) 25/1-tel ami 25
        // így a strangeSum értéke 25 marad

        // 3. futás:
        // a léptetés még mindig (i += 2 azaz i = i+2) ezért
        // a tömb 4. indexén lévő számot vizsgálja, ami itt 4 a tömb 5. indexén lévő szám hatványára emeli ami itt 2
        // így lesz a partResult értéke 4*4 = 16
        // utána megvizsgálja, az if ágat, hogy i értéke ami itt már 4, ha elosztom 4-gyel a maradéka 0 lesz-e.
        // mivel 4 osztva 4-gyel az 1 és nincs maradék így ez IGAZ
        // ezért a stangeSum nevű változom aminek értéke most 25 egyenlő lesz (strangeSum*partResault) 25*16 ami 400
        // igy a strangeSum értéke 400 lesz
        // és nem ugrik át az else ágba

        // 4. futás:
        // a léptetés még mindig (i += 2 azaz i = i+2) ezért
        // a tömb 6. indexén lévő elemet vizsgálja, ami itt 4 a tömb 7. indexén lévő szám hatványára emeli ami itt 1
        // így lesz a partResult értéke 4 az elsőn azaz 4
        // utána megvizsgálja, az if ágat, hogy i értéke ami itt már 6, ha elosztom 4-gyel a maradéka 0 lesz-e
        // mivel 6 osztva 4-gyel az 1.5 így ez HAMIS lesz és átugrik az else ágba
        // az else ágban strangSum ami most 400 egyenlő lesz (strangeSum/partResault) 400/4 ami 100
        // így a sum értéke 100 lesz

        // 5.futás:
        // a léptetés még mindig (i += 2 azaz i = i+2) ezért
        // a tömb 8.indexén lévő számot vizsgálja, ami itt 2 a tömb 9. indexén lévő szám hatványára emeli ami itt 1
        // így lesz a partResult értéke 2 az elsőn az az 2
        // utána megvizsgálja, az if ágat, hogy i értéke ami itt már 8, ha elosztom 4-gyel a maradéka 0 lesz-e
        // mivel 8 osztva 4-gyel az 2 és nincs maradéka így ez IGAZ lesz
        // ezért a strangeSum nevű változo aminek értéke most 100 egyenlő lesz (strangeSum*partResault) 100*2
        // így a strangeSum értéke 200 lesz.
        // VÉGE A CIKLUSNAK (mivel a tömb hossza -1-ig ment)


        System.out.println("6. Every third number is doubled before adding to the sum.");
        System.out.println(5 + 2 + (2) + 3 + 4 + (2 * 2) + 4 + 1 + (2 * 2) + 1);
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            if ((i + 1) % 3 == 0) {
                sum += (numbers[i] * 2);
            } else {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
        System.out.println();

        System.out.println("7. Compute the sum of an array while skipping numbers that are multiples of 3.");
        int sum1 = 0;
        for (int number : numbers) {
            if (number % 3 != 0) {
                sum1 += number;
            }
        }
        System.out.println(sum1);
        System.out.println();

        System.out.println("8. Given an array of numbers, compute the sum where: If a number is prime, add its square instead. Otherwise, add it normally.");
        int sum2 = 0;
        for (int number : numbers) {
            if (!isPrimeNumber(number)) {
                sum2 += number;
            }
        }
        System.out.println(sum2);
        System.out.println();

        System.out.println("9. Count how many numbers are even and how many are odd in an array.");
        byte maxEven = 0;
        byte maxOdd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                maxEven++;
            } else {
                maxOdd++;
            }
        }
        System.out.println("Even count = " + maxEven + "\n" + "Odd count = " + maxOdd);
        System.out.println();

        System.out.println("10. Compute the sum of an array while ignoring negative numbers.");
        int[] numbers2 = {5, -2, 1, 3, -4, -2, 4, 1, 2, 1};
        int sum3 = 0;
        for (int number : numbers2) {
            if (number >= 0) {
                sum3 += number;
            }
        }
        System.out.println(sum3);
        System.out.println();

        System.out.println("11. (n1×n2×n3)÷(-n4×-n5) positive numbers are multiplied, and negative numbers are divided.");

        int productOfPositiveNumbers = 1;
        int productOfNegativeNumbers = 1;
        double sum4 = 0;
        for (int number : numbers2) {
            if (number > 0) {
                productOfPositiveNumbers *= number;
            } else {
                productOfNegativeNumbers *= number;
            }

        }
        sum4 = (double) productOfPositiveNumbers / productOfNegativeNumbers;
        System.out.println(sum4);

    }


    public static boolean isPrimeNumber(int number) {
        boolean isTrue = true;
        if (number <= 1) {
            isTrue = false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }

}