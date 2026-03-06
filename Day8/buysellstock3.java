package Day8;

public class buysellstock3 {// 123. Best Time to Buy and Sell Stock III
    public int MaxProfit(int[] prices) {
        int buy1 = Integer.MIN_VALUE;// buy today
        int sell1 = 0;// sell any day before buying another
        int buy2 = Integer.MIN_VALUE;// buy stock after selling sell1

        int sell2 = 0;// sell any day after buying buy2
        for (int price : prices) {
            buy1 = Math.max(buy1, -price);
            sell1 = Math.max(sell1, buy1 + price);
            buy2 = Math.max(sell1 - price, buy2);
            sell2 = Math.max(sell2, buy2 + price);
            // at most 2 stocks so buy 1 and 2 is limited

        }
        return sell2;
    }

    public static void main(String[] args) {
        buysellstock3 ob = new buysellstock3();

        int prices[] = { 3, 3, 5, 0, 0, 3, 1, 4 };
        System.out.println(ob.MaxProfit(prices));
    }
}