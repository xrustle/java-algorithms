package com.batorov;

import static com.batorov.RemoveElements.removeElement;
import static java.util.Arrays.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveElementsTest {
  @Test
  void testRemoveCount() {
    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
    int val = 2;

    int k = removeElement(nums, val);

    int expected = 5;

    assertEquals(expected, k);
  }

  @Test
  void testRemoveArray() {
    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
    int val = 2;

    int k = removeElement(nums, val);

    int[] expected = {0, 0, 1, 3, 4};

    sort(nums, 0, k); // Sort the first k elements of nums
    for (int i = 0; i < k; i++) {
      assert nums[i] == expected[i];
    }
  }
}
