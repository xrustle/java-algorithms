/**
 * This class MajorityElement provides 3 different methods to find the majority element in an array.
 * The majority element is defined as the element that appears more than ⌊n / 2⌋ times in an array
 * of size n. You can assume that the majority element always exists in the array.
 *
 * <p>The 3 methods provided using different approaches: sorting, hash mapping, and the Moore Voting
 * Algorithm.
 */
package com.batorov;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

  /**
   * This method finds the majority element in the array by sorting it.
   *
   * @param nums Input array
   * @return The majority element in the input array
   */
  public static int majorityElement(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    return nums[n / 2];
  }

  /**
   * This method finds the majority element in the array by constructing a hash map that maps each
   * element to its count.
   *
   * @param nums Input array
   * @return The majority element in the input array
   */
  public static int majorityElement2(int[] nums) {
    int n = nums.length;
    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    n = n / 2;
    for (var entry : map.entrySet()) {
      if (entry.getValue() > n) {
        return entry.getKey();
      }
    }

    return 0;
  }

  /**
   * This method finds the majority element in the array using Moore's Voting Algorithm.
   *
   * @param nums Input array
   * @return The majority element in the input array
   */
  public static int majorityElement3(int[] nums) {
    int count = 0;
    int candidate = 0;

    for (int num : nums) {
      if (count == 0) {
        candidate = num;
      }

      if (num == candidate) {
        count++;
      } else {
        count--;
      }
    }

    return candidate;
  }
}
