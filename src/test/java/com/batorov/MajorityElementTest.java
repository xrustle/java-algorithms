package com.batorov;

import static com.batorov.MajorityElement.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MajorityElementTest {

  @Test
  void majorityElementTest1() {
    int[] nums = {2, 3, 3, 5, 3, 3, 6};
    int expected = 3;
    int majorityElement = majorityElement(nums);

    assertEquals(expected, majorityElement);
  }

  @Test
  void majorityElementTest2() {
    int[] nums = {2, 3, 3, 5, 3, 3, 6};
    int expected = 3;
    int majorityElement = majorityElement2(nums);

    assertEquals(expected, majorityElement);
  }

  @Test
  void majorityElementTest3() {
    int[] nums = {2, 3, 3, 5, 3, 3, 6};
    int expected = 3;
    int majorityElement = majorityElement3(nums);

    assertEquals(expected, majorityElement);
  }

  @Test
  void majorityElementTest4() {
    int[] nums = {3, 2, 3};
    int expected = 3;
    int majorityElement = majorityElement(nums);

    assertEquals(expected, majorityElement);
  }

  @Test
  void majorityElementTest5() {
    int[] nums = {3, 2, 3};
    int expected = 3;
    int majorityElement = majorityElement2(nums);

    assertEquals(expected, majorityElement);
  }

  @Test
  void majorityElementTest6() {
    int[] nums = {3, 2, 3};
    int expected = 3;
    int majorityElement = majorityElement3(nums);

    assertEquals(expected, majorityElement);
  }
}
