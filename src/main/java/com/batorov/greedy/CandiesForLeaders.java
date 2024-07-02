package com.batorov.greedy;

public class CandiesForLeaders {
  private CandiesForLeaders() {}

  /**
   * This method calculates the minimum number of candies needed to distribute to children in such a
   * manner that each child gets at least one candy and the children with a higher rating get more
   * candies than their neighbors.
   *
   * @param ratings an array of integers representing the rating of each child. Ratings are
   *     guaranteed to be non-negative.
   * @return the minimum number of candies that need to be distributed among the children.
   *     <p><b>Example:</b>
   *     <p>If the array of ratings is {1, 0, 2} then this method will return 5 as the children with
   *     rating 1 and 2 gets 2 candies and the other child get 1 candy.
   */
  public static int candy(int[] ratings) {
    int[] candies = new int[ratings.length];
    int totalCandies = ratings.length;
    int i;

    candies[0] = 0;
    for (i = 0; i < ratings.length - 1; i++) {
      if (ratings[i] < ratings[i + 1]) {
        candies[i + 1] = candies[i] + 1;
      } else {
        candies[i + 1] = 0;
      }
    }

    totalCandies += candies[ratings.length - 1];
    for (i = ratings.length - 1; i > 0; i--) {
      if (ratings[i - 1] > ratings[i] && candies[i - 1] <= candies[i]) {
        candies[i - 1] = candies[i] + 1;
      }
      totalCandies += candies[i - 1];
    }

    return totalCandies;
  }
}
