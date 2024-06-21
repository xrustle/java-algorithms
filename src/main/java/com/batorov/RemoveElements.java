package com.batorov;

public class RemoveElements {
  public static int removeElement(int[] nums, int val) {
    var k = 0;

    for (var i = 0; i < nums.length; i++) {
      if (nums[i] == val) {
        k++;
      } else if (k > 0) {
        nums[i - k] = nums[i];
      }
    }

    return nums.length - k;
  }
}
