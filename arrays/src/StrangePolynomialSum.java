import java.util.Scanner;

public class StrangePolynomialSum {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("First possible solution:");
        countStrangePolynomialSum(number);
        System.out.println();
        System.out.println("Second possible solution:");
        countStrangePolynomialSum2(number);
        System.out.println();
        System.out.println("Difficult strange task solution: ");
        countDifficultStrangeSum(number);
    }

    public static boolean isGreaterThanOne(int number) {
        return number < 1;
    }

    public static void countDifficultStrangeSum(int number) {
        int sum = 0;
        if (isGreaterThanOne(number)) {
            System.out.println("End of the application");
        } else {
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
            System.out.println(sum);

        }

    }

    public static void countStrangePolynomialSum(int number) {
        if (isGreaterThanOne(number)) {
            System.out.println("End of the application");
        } else {
            int sum = 0;
            int counter = 1;
            int counter2 = 2;
            int counter3 = 3;
            int counter4 = 4;
            for (int i = 1; i <= number; i++) {
                if (i == counter) {
                    sum += (int) Math.pow(i, 1);
                    counter += 4;
                } else if (i == counter2) {
                    sum += (int) Math.pow(i, 2);
                    counter2 += 4;
                } else if (i == counter3) {
                    sum += (int) Math.pow(i, 3);
                    counter3 += 4;
                } else if (i == counter4) {
                    sum += (int) Math.pow(i, 4);
                    counter4 += 4;
                }
            }
            System.out.println(sum);
        }
    }

    public static void countStrangePolynomialSum2(int number) {
        if (isGreaterThanOne(number)) {
            System.out.println("End of the application");
        } else {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                if (i % 4 == 1)
                    sum += (int) Math.pow(i, 1);
                else if (i % 4 == 2) {
                    sum += (int) Math.pow(i, 2);
                } else if (i % 4 == 3) {
                    sum += (int) Math.pow(i, 3);
                } else if (i % 4 == 0) {
                    sum += (int) Math.pow(i, 4);
                }

            }
            System.out.println(sum);
        }
    }
}
