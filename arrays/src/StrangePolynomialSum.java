import java.util.Scanner;

public class StrangePolynomialSum {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("First possible solution:");
        int strangeSum = countStrangePolynomialSum(number);
        System.out.println(checkInputAndComputeSum(strangeSum));
        System.out.println();
        System.out.println("Second possible solution:");
        int strangeSum2 = countStrangePolynomialSum2(number);
        System.out.println(checkInputAndComputeSum(strangeSum2));
        System.out.println();
        System.out.println("Difficult strange task solution: ");
        int difficultStrangeSum = countDifficultStrangeSum(number);
        System.out.println(checkInputAndComputeSum(difficultStrangeSum));

    }

    public static boolean isGreaterThanOne(int number) {
        return number > 1;
    }

    public static String checkInputAndComputeSum(int number) {
        String stringNumber = String.valueOf(number);
        return isGreaterThanOne(number) ? stringNumber : "End of the application";

    }

    public static int countDifficultStrangeSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 1) {
                    if (i % 5 == 0) {
                        sum -= 2 * (i);
                    } else {
                        sum -= i;
                    }
                } else if (i % 3 == 2) {
                    if (i % 5 == 0) {
                        sum -= 2 * (i * i);
                    } else {
                        sum -= i * i;
                    }
                } else if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        sum -= 2 * (i * i * i);
                    } else {
                        sum -= i * i * i;
                    }
                }
            } else {
                if (i % 3 == 1) {
                    if (i % 5 == 0) {
                        sum += 2 * (i);
                    } else {
                        sum += i;
                    }
                } else if (i % 3 == 2) {
                    if (i % 5 == 0) {
                        sum += 2 * (i * i);
                    } else {
                        sum += i * i;
                    }
                } else if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        sum += 2 * (i * i * i);
                    } else {
                        sum += i * i * i;
                    }
                }
            }
        }
        return sum * number;
    }

    public static int countStrangePolynomialSum(int number) {
        int sum = 0;
        int counter = 1;
        int counter2 = 2;
        int counter3 = 3;
        for (int i = 1; i <= number; i++) {
            if (i == counter) {
                sum += i;
                counter += 4;
            } else if (i == counter2) {
                sum += (int) Math.pow(i, 2);
                counter2 += 4;
            } else if (i == counter3) {
                sum += (int) Math.pow(i, 3);
                counter3 += 4;
            } else {
                sum += (int) Math.pow(i, 4);

            }
        }
        return sum;
    }

    public static int countStrangePolynomialSum2(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += (i%4==1) ? i : (int) ((i % 4 == 2) ? Math.pow(i, 2) : (i % 4 == 3)
                    ? Math.pow(i, 3) : Math.pow(i, 4));
//            if (i % 4 == 1)
//                sum += i;
//            else if (i % 4 == 2) {
//                sum += (int) Math.pow(i, 2);
//            } else if (i % 4 == 3) {
//                sum += (int) Math.pow(i, 3);
//            } else {
//                sum += (int) Math.pow(i, 4);
//            }

        }
        return sum;

    }
}
