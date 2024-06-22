package com.batorov;

import static com.batorov.GreatestCommonDivisor.greatestCommonDivisor;

public class RotateArray {
  // Not optimal solution
  public static void rotateArray(int[] nums, int k) {
    var n = nums.length;
    k = k % n;
    var gcd = greatestCommonDivisor(k, n);
    int curIndex;
    int nextIndex;
    int tmp;

    for (var i = 0; i < gcd; i++) {
      curIndex = i;
      nextIndex = (curIndex - k + n) % n;
      while (nextIndex != i) {
        tmp = nums[curIndex];
        nums[curIndex] = nums[nextIndex];
        nums[nextIndex] = tmp;

        curIndex = nextIndex;
        nextIndex = (curIndex - k + n) % n;
      }
    }
  }

  // Optimal solution with triple rotation
  public static void reverse(int[] nums, int i, int j) {
    int li = i;
    int ri = j;

    while (li < ri) {
      int temp = nums[li];
      nums[li] = nums[ri];
      nums[ri] = temp;

      li++;
      ri--;
    }
  }

  public void rotate(int[] nums, int k) {
    k = k % nums.length;
    if (k < 0) {
      k += nums.length;
    }
    reverse(nums, 0, nums.length - k - 1);
    reverse(nums, nums.length - k, nums.length - 1);
    reverse(nums, 0, nums.length - 1);
  }
}
