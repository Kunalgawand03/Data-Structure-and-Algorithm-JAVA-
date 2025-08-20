public class BuyandSellStocks {
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            // Update buy price if current price is lower
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;           //Today's price minus buy price gives profit
                // Update max profit if current profit is greater
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Update buy price if current price is lower
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int result = buyAndSellStocks(prices);
        System.out.println("Maximum profit from buying and selling stocks is: " + result);
    }
}
