package com.batorov.dp;

public class JumpGameMinSteps {
  private JumpGameMinSteps() {}

  public static int countMinSteps(int[] nums) {
    int farthest = 0;
    int currEnd = 0;
    int currSteps = 0;

    for (var i = 0; i < nums.length - 1; i++) {
      farthest = Math.max(farthest, nums[i] + i);

      if (farthest >= nums.length - 1) {
        currSteps++;
        return currSteps;
      }

      if (i == currEnd) {
        currSteps++;
        currEnd = farthest;
      }
    }

    return currSteps;
  }
}
