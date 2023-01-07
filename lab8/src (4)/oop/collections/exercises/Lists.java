package oop.collections.exercises;

import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);

    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(list.size(), value);

    }

    public static void replace(ArrayList<Integer> list, int value) {
        if (list.size() >= 3) {
            list.set(2, value);
        }

    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        if (list == null) {
            return;
        }

        list.removeIf(i -> i == 666);
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> slist = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            slist.add(i * i);
        }
        return slist;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        if (target != null) {
            return;
        }
        target.clear();
        int size = source.size();
        int i = 0;
        while (i < size) {
            target.add(i);
            i++;
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        if (list == null || list.size() == 1) {
            return;
        }
        for (int i = 0; i < list.size()/2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
