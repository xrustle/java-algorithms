package com.batorov;

public class RemoveDuplicates {
  public static int removeDuplicates(int[] nums) {
    int k = 0;
    for (var i = 1; i < nums.length; i++) {
      if (nums[i] != nums[k]) {
        k = k + 1;
        nums[k] = nums[i];
      }
    }
    return k + 1;
  }
}
