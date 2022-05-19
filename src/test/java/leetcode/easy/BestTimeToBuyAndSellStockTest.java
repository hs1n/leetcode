package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    void example01() {
        assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void example02() {
        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void custom01() {
        assertEquals(1, bestTimeToBuyAndSellStock.maxProfit(new int[]{1, 2}));
    }
}