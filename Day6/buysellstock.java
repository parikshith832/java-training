package Day6;

public class buysellstock {// 121
    public int maxProfit(int[] prices) {
        int max = 0;

        for (int i = 0; i < prices.length - 1; i++) {

            for (int j = i + 1; j < prices.length; j++) {

                int profit = prices[j] - prices[i];// checks all the profit values
                // System.out.println(i + " profit: " + profit);

                if (profit > max) {
                    max = profit;// extracts only the highest profit value
                }

            }
        }
        return max;
    }

    public int orMaxProfit(int[] prices) {
        int buy = Integer.MIN_VALUE;
        int sell = 0;
        for (int price : prices) {
            buy = Math.max(buy, -price);
            sell = Math.max(sell, buy + price);

        }
        return sell;
    }

    public static void main(String[] args) {
        buysellstock ob = new buysellstock();
        int nums[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(ob.maxProfit(nums));

        System.out.println(ob.orMaxProfit(nums));
    }
}
