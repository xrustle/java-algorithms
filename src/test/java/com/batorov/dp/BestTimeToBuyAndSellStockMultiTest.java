package com.batorov.dp;

import static com.batorov.dp.BestTimeToBuyAndSellStockMulti.maxProfit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockMultiTest {
  @Test
  void bestTimeToBuyAndSellStockTest() {
    int[] nums = {7, 1, 5, 3, 6, 4};
    int expectedMaxProfit = 7;
    int maxProfit = maxProfit(nums);

    assertEquals(expectedMaxProfit, maxProfit);
  }

  @Test
  void bestTimeToBuyAndSellStockTest2() {
    int[] nums = {1, 2, 3, 4, 5};
    int expectedMaxProfit = 4;
    int maxProfit = maxProfit(nums);

    assertEquals(expectedMaxProfit, maxProfit);
  }
}
