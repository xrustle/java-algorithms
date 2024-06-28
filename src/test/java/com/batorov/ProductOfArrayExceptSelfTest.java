package com.batorov;

import static com.batorov.ProductOfArrayExceptSelf.productExceptSelf;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {
  @Test
  void majorityElementTest1() {
    int[] nums = {1, 2, 3, 4};
    int[] expected = {24, 12, 8, 6};
    int[] productsExceptSelf = productExceptSelf(nums);

    assertArrayEquals(expected, productsExceptSelf);
  }

  @Test
  void majorityElementTest2() {
    int[] nums = {-1, 1, 0, -3, 3};
    int[] expected = {0, 0, 9, 0, 0};
    int[] productsExceptSelf = productExceptSelf(nums);

    assertArrayEquals(expected, productsExceptSelf);
  }
}
