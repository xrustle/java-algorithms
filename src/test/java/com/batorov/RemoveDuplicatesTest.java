package com.batorov;

import static com.batorov.RemoveDuplicates.removeDuplicates;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {
  @Test
  void removeDuplicatesCountTest() {
    int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // Input array
    int k = removeDuplicates(nums); // Calls your implementation
    int expectedCount = 5;

    assertEquals(expectedCount, k);
  }

  @Test
  void removeDuplicatesArrayTest() {
    int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // Input array
    int[] expectedNums = {0, 1, 2, 3, 4}; // The expected answer with correct length

    int k = removeDuplicates(nums); // Calls your implementation

    for (int i = 0; i < k; i++) {
      assertEquals(expectedNums[i], nums[i]);
    }
  }
}
