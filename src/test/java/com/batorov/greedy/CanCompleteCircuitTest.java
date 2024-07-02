package com.batorov.greedy;

import static com.batorov.greedy.CanCompleteCircuit.canCompleteCircuit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CanCompleteCircuitTest {
  @Test
  void canCompleteCircuitTest1() {
    int[] gas = {1, 2, 3, 4, 5};
    int[] cost = {3, 4, 5, 1, 2};

    int expected = 3;
    int bestStart = canCompleteCircuit(gas, cost);

    assertEquals(expected, bestStart);
  }

  @Test
  void canCompleteCircuitTest2() {
    int[] gas = {2, 3, 4};
    int[] cost = {3, 4, 3};

    int expected = -1;
    int bestStart = canCompleteCircuit(gas, cost);

    assertEquals(expected, bestStart);
  }

  @Test
  void canCompleteCircuitTest3() {
    int[] gas = {5, 8, 2, 8};
    int[] cost = {6, 5, 6, 6};

    int expected = 3;
    int bestStart = canCompleteCircuit(gas, cost);

    assertEquals(expected, bestStart);
  }
}
