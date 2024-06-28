package com.batorov;

public class ProductOfArrayExceptSelf {
  private ProductOfArrayExceptSelf() {}

  public static int[] productExceptSelf2(int[] nums) {
    var leftProds = new int[nums.length - 1];
    leftProds[0] = nums[0];
    for (int i = 1; i < leftProds.length; i++) {
      leftProds[i] = leftProds[i - 1] * nums[i];
    }

    var prod = nums[nums.length - 1];
    int temp;
    nums[nums.length - 1] = leftProds[nums.length - 2];
    for (int i = nums.length - 2; i > 0; i--) {
      temp = nums[i];
      nums[i] = leftProds[i - 1] * prod;
      prod *= temp;
    }
    nums[0] = prod;

    return nums;
  }

  public static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    int currProd = 1;

    for (int i = 0; i < n; i++) {
      result[i] = currProd;
      currProd *= nums[i];
    }
    currProd = 1;

    for (int i = n - 1; i >= 0; i--) {
      result[i] *= currProd;
      currProd *= nums[i];
    }

    return result;
  }
}
