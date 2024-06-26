package com.batorov.dp;

import java.util.Arrays;

public class HIndex {
  private HIndex() {}

  public static int hIndex(int[] citations) {
    var hIndex = 0;

    Arrays.parallelSort(citations);
    while (hIndex < citations.length) {
      if (citations[citations.length - hIndex - 1] < hIndex + 1) {
        break;
      }
      hIndex++;
    }

    return hIndex;
  }

  public static int hIndex2(int[] citations) {
    int[] freq = new int[1001];
    int max = Integer.MIN_VALUE;

    for (int c : citations) {
      freq[c]++;
      max = Math.max(c, max);
    }

    int count_citations = 0;
    int i = max;

    for (; i >= 0; i--) {
      count_citations += freq[i];
      if (count_citations >= i) {
        break;
      }
    }
    return i;
  }
}
