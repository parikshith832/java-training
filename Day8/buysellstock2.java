package Day8;

public class buysellstock2 {// 122. Best Time to Buy and Sell Stock II
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int n = prices.length;
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {// here we buy yesterday and sell it today

                profit = profit + prices[i] - prices[i - 1];// checks all the profit values
                // System.out.println(i + " profit: " + profit);

            }
        }
        System.out.println(profit);
    }

}
