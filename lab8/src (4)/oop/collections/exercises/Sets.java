package oop.collections.exercises;

import java.util.*;

public class Sets {

    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> h_set = new HashSet<Integer>();
        //     first.retainAll(second);
        for (int i : first) {
            for (int j : second) {
                if (i == j) {
                    h_set.add(i);
                    break;
                }
            }
        }
        return h_set;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> h_set = new HashSet<Integer>();
        for (int i : first) {
            h_set.add(i);
        }

        for (int j : second) {
            h_set.add(j);
        }
        return h_set;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        first.retainAll(second);
        return first;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        first.addAll(second);
        return first;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new ArrayList<Integer>(source);
        return list;
        // return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new HashSet<>(source));
    }

    public static List<Integer> removeDuplicatesMannual(List<Integer> source) {
        List<Integer> list = new ArrayList<Integer>(source);
        for (int i : source) {
            if (list.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static String firstRecurringCharacter(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }

        Set<String> h_set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String res = s.charAt(i) + "";
            if (h_set.contains(res)) {
                return res;
            }
            h_set.add(res);
        }
        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> h_set = new HashSet<>();
        Set<Character> res = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (h_set.contains(c)) {
                res.add(c);
            } else {
                h_set.add(c);
            }
        }
        return res;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] new_array = new Integer[source.size()];
        source.toArray(new_array);
        return new_array;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}
