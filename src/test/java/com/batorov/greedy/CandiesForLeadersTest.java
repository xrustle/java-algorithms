package com.batorov.greedy;

import static com.batorov.greedy.CandiesForLeaders.candy;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CandiesForLeadersTest {
  @Test
  void CandiesForLeaders() {
    int[] ratings = {1, 0, 2};

    int expected = 5;
    int totalCandies = candy(ratings);

    assertEquals(expected, totalCandies);
  }

  @Test
  void CandiesForLeaders2() {
    int[] ratings = {1, 2, 2};

    int expected = 4;
    int totalCandies = candy(ratings);

    assertEquals(expected, totalCandies);
  }

  @Test
  void CandiesForLeaders3() {
    int[] ratings = {1, 2, 87, 87, 87, 2, 1};

    int expected = 13;
    int totalCandies = candy(ratings);

    assertEquals(expected, totalCandies);
  }

  @Test
  void CandiesForLeaders4() {
    int[] ratings = {1, 3, 2, 2, 1};

    int expected = 7;
    int totalCandies = candy(ratings);

    assertEquals(expected, totalCandies);
  }
}
