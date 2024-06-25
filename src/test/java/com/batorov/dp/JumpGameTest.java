package com.batorov.dp;

import static com.batorov.dp.JumpGame.canJump;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JumpGameTest {
  @Test
  void jumpGameTest() {
    int[] nums = {2, 3, 1, 1, 4};
    boolean expected = true;
    boolean actual = canJump(nums);

    assertEquals(expected, actual);
  }

  @Test
  void jumpGameTest2() {
    int[] nums = {3, 2, 1, 0, 4};
    boolean expected = false;
    boolean actual = canJump(nums);

    assertEquals(expected, actual);
  }

  @Test
  void jumpGameTest3() {
    int[] nums = {2, 0};
    boolean expected = true;
    boolean actual = canJump(nums);

    assertEquals(expected, actual);
  }

  @Test
  void jumpGameTest4() {
    int[] nums = {2, 5, 0, 0};
    boolean expected = true;
    boolean actual = canJump(nums);

    assertEquals(expected, actual);
  }

  @Test
  void jumpGameTest5() {
    int[] nums = {0};
    boolean expected = true;
    boolean actual = canJump(nums);

    assertEquals(expected, actual);
  }

  @Test
  void jumpGameTest6() {
    int[] nums = {3, 0, 8, 2, 0, 0, 1};
    boolean expected = true;
    boolean actual = canJump(nums);

    assertEquals(expected, actual);
  }
}
