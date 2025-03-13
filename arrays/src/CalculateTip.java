import java.util.Scanner;

public class CalculateTip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] prices = {2000, 250, 300, 50, 250};
        System.out.print("Please enter what percentage tip you would like to give.: ");
        int tipPercent = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println(calculateTip(prices, tipPercent));

    }

    public static boolean isValidNumber(int tipPercent) {
        return tipPercent >= 10 && tipPercent <= 80;
    }

    public static int getTipWithinRange(int tipPercent) {
        return isValidNumber(tipPercent) ? tipPercent : -1;
    }

    public static int calculateSumPrices(int[] prices) {
        int sumPrices = 0;
        for (int price : prices) {
            sumPrices += price;
        }
        return sumPrices;
    }

    public static int calculateTip(int[] prices, int tipPercent) {
        int ValidTip = getTipWithinRange(tipPercent);
        if (ValidTip == -1) {
            return -1;
        }
        int sumPrices = calculateSumPrices(prices);
        return (sumPrices * ValidTip) / 100;
    }
}