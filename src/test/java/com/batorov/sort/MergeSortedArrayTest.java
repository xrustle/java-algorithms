package com.batorov.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {
  @Test
  void testMerge1() {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int m = 3;
    int[] nums2 = {2, 5, 6};
    int n = 3;

    var mergeObj = new MergeSortedArray();
    mergeObj.merge(nums1, m, nums2, n);

    int[] expected = {1, 2, 2, 3, 5, 6};

    assertArrayEquals(nums1, expected);
  }

  @Test
  void testMerge2() {
    int[] nums1 = {1};
    int m = 1;
    int[] nums2 = {};
    int n = 0;

    var mergeObj = new MergeSortedArray();
    mergeObj.merge(nums1, m, nums2, n);

    int[] expected = {1};

    assertArrayEquals(nums1, expected);
  }

  @Test
  void testMerge3() {
    int[] nums1 = {0};
    int m = 0;
    int[] nums2 = {1};
    int n = 1;

    var mergeObj = new MergeSortedArray();
    mergeObj.merge(nums1, m, nums2, n);

    int[] expected = {1};

    assertArrayEquals(nums1, expected);
  }
}
