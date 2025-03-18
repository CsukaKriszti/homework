import java.util.Scanner;

public class NumberConverter {

    static final String[] ONE_TO_NINETEEN = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static final String[] TWENTY_TO_NINETY = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    static final String HUNDRED = "hundred";
    static final String[] THOUSANDS = {"thousand", "million", "billion", "million"};

    //    static final int NUMBER = 278;
    // nine hundred ninety-nine trillion nine hundred ninety-nine billion nine hundred ninety-nine million nine  hundred ninety-nine thousand nine hundred ninety-nine
    public static String convertNumberToWord(int number) {
        //ha a szám 1-től 19-ig van, akkor az 1-19-es tömbből válassza ki az értéket
        if (isNumberBetween1and19(number)) {
            return ONE_TO_NINETEEN[number];
        }
        //        NUMBER++;
        //        ONE_TO_NINETEEN = new String[30];
        //        ONE_TO_NINETEEN[16] = "hello";

        //if divisible with 10 --> don't put a hyphen
        //else -->  put a hyphen
        if (isSmallerThan100(number)) {
            return
                    isDivisibleBy10(number) ?
                            TWENTY_TO_NINETY[number / 10] :
                            TWENTY_TO_NINETY[number / 10]
                                    .concat("-")
                                    .concat(ONE_TO_NINETEEN[number % 10]);
        }

        //567
        if(number % 100 == 0){
            return ONE_TO_NINETEEN[number / 100]
                    .concat(" ")
                    .concat(HUNDRED);
        }
        int hundreds = number / 100;
        number -= hundreds * 100; //67
        if (isNumberBetween1and19(number)) {
            //two hundred sixteen
            return ONE_TO_NINETEEN[hundreds] //"eight"
                    .concat(" ")       //" "
                    .concat(HUNDRED)     //"hundred"
                    .concat(" ")
                    .concat(ONE_TO_NINETEEN[number]);
        }
        if (isDivisibleBy10(number)) {
            return ONE_TO_NINETEEN[hundreds]
                    .concat(" ")       //" "
                    .concat(HUNDRED)     //"hundred
                    .concat(" ")
                    .concat(TWENTY_TO_NINETY[number / 10]);
        }

        int tens = number / 10;
        number -= tens * 10; //7
        int ones = number % 10;

        return

                ONE_TO_NINETEEN[hundreds] //"eight"
                        .concat(" ")       //" "
                        .concat(HUNDRED)     //"hundred"
                        .concat(" ")
                        .concat(TWENTY_TO_NINETY[tens])        //ninety
                        .concat("-")
                        .concat(ONE_TO_NINETEEN[ones]);
        //return twenty-one

        //21
        //TENS[2] + ONE_TO_NINETY[1];
        //59
        //TENS[5] + ONE_TO_NINETY[9];

        //TENS[number / 10] + ONE_TO_NINETY[number % 10]
    }

    private static boolean isDivisibleBy10(int number) {
        return number % 10 == 0;
    }

    public static boolean isSmallerThan100(int number) {
        return number < 100;
    }

    public static boolean isNumberBetween1and19(int number) {
        return number >= 1 && number <= 19;
    }

    //    public static String sdfff(int number){
    //        return TWENTY_TO_HUNDRED[number];
    //    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String word = convertNumberToWord(number);
    }


}
