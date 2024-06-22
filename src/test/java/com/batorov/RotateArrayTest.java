package com.batorov;

import static com.batorov.RotateArray.rotateArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class RotateArrayTest {
  @Test
  void rotateArrayTest1() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    int k = 10;
    int[] expected = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1, 2, 3, 4, 5};
    rotateArray(nums, k);
    assertArrayEquals(expected, nums);
  }

  @Test
  void rotateArrayTest2() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int k = 7;
    int[] expected = {3, 4, 5, 6, 7, 8, 9, 1, 2};
    rotateArray(nums, k);
    assertArrayEquals(expected, nums);
  }

  @Test
  void rotateArrayTest3() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    int k = 4;
    int[] expected = {12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    rotateArray(nums, k);
    assertArrayEquals(expected, nums);
  }

  @Test
  void rotateArrayTest4() {
    int[] nums = {1, 2, 3};
    int k = 0;
    int[] expected = {1, 2, 3};
    rotateArray(nums, k);
    assertArrayEquals(expected, nums);
  }

  @Test
  void rotateArrayTest5() {
    int[] nums = {1};
    int k = 7;
    int[] expected = {1};
    rotateArray(nums, k);
    assertArrayEquals(expected, nums);
  }
}
