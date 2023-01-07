package oop.collections.exercises;

import java.util.*;

public class TestSets {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>(List.of(2, 4, 7, 8));
        Set<Integer> second = new HashSet<>(List.of(4, 7, 9, 1));
        System.out.println(Sets.intersectionManual(first, second));
        System.out.println(Sets.unionManual(first, second));
        System.out.println(Sets.intersection(first, second));
        System.out.println(Sets.union(first, second));
        List<Integer> list = Sets.toList(first);
        System.out.println(list);
        System.out.println(Sets.removeDuplicates(list));
        System.out.println(Sets.removeDuplicatesMannual(list));
        String k = "12345";
        System.out.println(Sets.firstRecurringCharacter(k));
        System.out.println(Sets.allRecurringChars(k));
        System.out.println(Sets.toArray(second));
        TreeSet<Integer> tree_set = new TreeSet<Integer>();
        System.out.println(Sets.getFirst(tree_set));
        System.out.println(Sets.getLast(tree_set));
        System.out.println(Sets.getGreater(tree_set, 4));

    }
}
