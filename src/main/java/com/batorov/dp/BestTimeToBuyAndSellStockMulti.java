package com.batorov.dp;

public class BestTimeToBuyAndSellStockMulti {

  private BestTimeToBuyAndSellStockMulti() throws NoSuchMethodException {
    throw new NoSuchMethodException();
  }

  public static int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int profit = 0;

    for (var price : prices) {
      if (price - minPrice + profit > profit) {
        profit += price - minPrice;
        minPrice = price;
      } else if (price < minPrice) {
        minPrice = price;
      }
    }

    return profit;
  }
}
