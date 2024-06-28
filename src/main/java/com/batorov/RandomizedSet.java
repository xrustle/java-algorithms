package com.batorov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {
  private final ArrayList<Integer> list;
  private final Map<Integer, Integer> map;
  private final Random random;

  public RandomizedSet() {
    list = new ArrayList<>();
    map = new HashMap<>();
    random = new Random();
  }

  public boolean search(int val) {
    return map.containsKey(val);
  }

  public boolean insert(int val) {
    if (search(val)) {
      return false;
    }

    list.add(val);
    map.put(val, list.size() - 1);

    return true;
  }

  public boolean remove(int val) {
    if (!search(val)) {
      return false;
    }

    var index = map.get(val);

    list.set(index, list.getLast());
    map.put(list.get(index), index);
    list.removeLast();
    map.remove(val);

    return true;
  }

  public int getRandom() {
    return list.get(random.nextInt(list.size()));
  }
}
