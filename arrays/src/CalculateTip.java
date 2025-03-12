import java.util.Scanner;

public class CalculateTip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] prices = {2000, 250, 300, 50, 250};
        System.out.print("Please enter what percentage tip you would like to give.: ");
        int tipPercent = Integer.parseInt(scanner.nextLine());
        int checkedTipPercent = checkAndReturnInRange(tipPercent);
        System.out.println(calculateTip(prices, checkedTipPercent));
    }

    public static int checkAndReturnInRange(int tipPercent) {
        if (tipPercent < 10 || tipPercent > 80) {
            return -1;
        }

        return tipPercent;
    }

    public static int calculateTip(int[] prices, int tipPercent) {
        if (tipPercent == -1)
            return -1;
        int sumPrices = 0;
        for (int price : prices) {
            sumPrices += price;
        }
        return (sumPrices * tipPercent) / 100;
    }
}