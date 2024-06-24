package com.batorov.dp;

import static com.batorov.dp.BestTimeToBuyAndSellStock.maxProfit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {
  @Test
  void bestTimeToBuyAndSellStockTest() {
    int[] nums = {7, 1, 5, 3, 6, 4};
    int expectedMaxProfit = 5;
    int maxProfit = maxProfit(nums);

    assertEquals(expectedMaxProfit, maxProfit);
  }

  @Test
  void bestTimeToBuyAndSellStockTest2() {
    int[] nums = {7, 6, 4, 3};
    int expectedMaxProfit = 0;
    int maxProfit = maxProfit(nums);

    assertEquals(expectedMaxProfit, maxProfit);
  }
}
