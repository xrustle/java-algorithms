package com.batorov.dp;

import static com.batorov.dp.HIndex.hIndex;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HIndexTest {
  @Test
  void jumpGameTest() {
    int[] nums = {3, 0, 6, 1, 5};
    var expected = 3;
    var actual = hIndex(nums);

    assertEquals(expected, actual);
  }

  @Test
  void jumpGameTest2() {
    int[] nums = {1, 3, 1};
    var expected = 1;
    var actual = hIndex(nums);

    assertEquals(expected, actual);
  }

  @Test
  void jumpGameTest3() {
    int[] nums = {1, 3, 3, 1};
    var expected = 2;
    var actual = hIndex(nums);

    assertEquals(expected, actual);
  }

  @Test
  void jumpGameTest4() {
    int[] nums = {0, 0};
    var expected = 0;
    var actual = hIndex(nums);

    assertEquals(expected, actual);
  }

  @Test
  void jumpGameTest5() {
    int[] nums = {1};
    var expected = 1;
    var actual = hIndex(nums);

    assertEquals(expected, actual);
  }
}
