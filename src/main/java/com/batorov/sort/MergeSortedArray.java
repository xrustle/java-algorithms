package com.batorov.sort;

public class MergeSortedArray {
  /**
   * Merges two input arrays into the first one in a non-decreasing order.
   *
   * @param nums1 first input array to be merged. It contains m initial elements following with
   *     empty slots
   * @param m number of actual elements in nums1
   * @param nums2 second input array containing n elements
   * @param n number of elements in nums2
   *     <p>The nums1 array has a length of m + n where the first m elements are the elements to be
   *     merged. The last n elements are set to 0 and should be ignored. The nums2 array has a
   *     length of n.
   */
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int curInsertPos = m + n - 1;
    int nums1Pos = m - 1;
    int nums2Pos = n - 1;

    while (nums2Pos >= 0) {
      if (nums1Pos >= 0 && nums1[nums1Pos] > nums2[nums2Pos]) {
        nums1[curInsertPos--] = nums1[nums1Pos--];
      } else {
        nums1[curInsertPos--] = nums2[nums2Pos--];
      }
    }
  }
}
