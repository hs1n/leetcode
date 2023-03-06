package leetcode.easy;

/**
 * @author hsin
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentLowest = 10000;
        int currentHighest = 0;
        for (int price : prices) {

            if (price < currentLowest) {
                currentLowest = price;
                currentHighest = 0;
            }
            currentHighest = Math.max(price, currentHighest);
            maxProfit = Math.max(maxProfit, (currentHighest - currentLowest));
        }
        return maxProfit;
    }
}