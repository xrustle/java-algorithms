package com.batorov.dp;

public class BestTimeToBuyAndSellStock {
  public static int maxProfit(int[] prices) {
    int buyPrice = prices[0];
    int profit = 0;

    for (var i = 1; i < prices.length; i++) {
      if (prices[i] - buyPrice > profit) {
        profit = prices[i] - buyPrice;
      }
      if (prices[i] < buyPrice) {
        buyPrice = prices[i];
      }
    }

    return profit;
  }
}
