package oop.collections.exercises;

import java.util.*;

public class TestMaps {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        hmap.put(1, 10);
        hmap.put(2, 20);
        hmap.put(3, 30);
        hmap.put(4, 40);
        hmap.put(5, 50);
        System.out.println(Maps.count(hmap));
        Maps.empty(hmap);
        System.out.println(hmap);

        hmap.put(1, 10);
        hmap.put(2, 20);
        hmap.put(3, 30);
        hmap.put(4, 40);
        hmap.put(5, 50);

        System.out.println(Maps.contains(hmap, 3));
        System.out.println(Maps.containsKeyValue(hmap, 2, 20));
        System.out.println(Maps.containsKeyValue(hmap, 1, 40));
        System.out.println(Maps.keySet(hmap));
        System.out.println(Maps.values(hmap));
        System.out.println(Maps.getColor(1));
    }
}
