package com.batorov;

import static com.batorov.RemoveDuplicatesMoreTwo.removeDuplicatesMoreTwo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesMoreTwoTest {
  @Test
  void removeDuplicatesCountTest() {
    int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
    int k = removeDuplicatesMoreTwo(nums);
    int expectedCount = 7;

    assertEquals(expectedCount, k);
  }

  @Test
  void removeDuplicatesArrayTest() {
    int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
    int[] expectedNums = {0, 0, 1, 1, 2, 3, 3};

    int k = removeDuplicatesMoreTwo(nums);

    for (int i = 0; i < k; i++) {
      assertEquals(expectedNums[i], nums[i]);
    }
  }
}
