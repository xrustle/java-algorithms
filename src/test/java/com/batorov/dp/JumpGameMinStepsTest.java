package com.batorov.dp;

import static com.batorov.dp.JumpGameMinSteps.countMinSteps;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JumpGameMinStepsTest {
  @Test
  void jumpGameTest() {
    int[] nums = {2, 3, 1, 1, 4};
    var expected = 2;
    var actual = countMinSteps(nums);

    assertEquals(expected, actual);
  }

  @Test
  void jumpGameTest2() {
    int[] nums = {2, 3, 0, 1, 4};
    var expected = 2;
    var actual = countMinSteps(nums);

    assertEquals(expected, actual);
  }

  @Test
  void jumpGameTest3() {
    int[] nums = {5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 9};
    var expected = 3;
    var actual = countMinSteps(nums);

    assertEquals(expected, actual);
  }

  @Test
  void jumpGameTest4() {
    int[] nums = {0};
    var expected = 0;
    var actual = countMinSteps(nums);

    assertEquals(expected, actual);
  }
}
