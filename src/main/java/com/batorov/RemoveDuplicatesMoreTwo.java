package com.batorov;

public class RemoveDuplicatesMoreTwo {
  /**
   * Removes duplicates from a sorted integer array in-place such that each unique element appears
   * at most twice. The relative order of the elements should be kept the same. The resulting array
   * is placed in the first part of the input array.
   *
   * @param nums the sorted integer array with possible duplicates.
   * @return k the number of elements in the modified array after removing duplicates.
   *     <p>Example: Input: nums = [1, 1, 1, 2, 2, 3] Output: 5, nums = [1,1,2,2,3,_]
   *     <p>Note: It is impossible to change the length of the array in Java, so the result is
   *     placed in the first part of the array nums. More formally, if there are k elements after
   *     removing the duplicates, then the first k elements of nums should hold the final result. It
   *     does not matter what you leave beyond the first k elements.
   */
  public static int removeDuplicatesMoreTwo(int[] nums) {
    var k = 0;
    var isSingle = true;

    for (var i = 1; i < nums.length; i++) {
      if (nums[i] != nums[k]) {
        k++;
        isSingle = true;
        nums[k] = nums[i];
      } else if (isSingle) {
        k++;
        nums[k] = nums[i];
        isSingle = false;
      }
    }

    return k + 1;
  }
}
