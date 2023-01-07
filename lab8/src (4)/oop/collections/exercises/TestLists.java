package oop.collections.exercises;

import java.util.*;

public class TestLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(3,4,5,6,7));
        Lists.insertFirst(list, 3);
        System.out.println(list);

        Lists.insertLast(list,8);
        System.out.println(list);

        Lists.replace(list, 2);
        System.out.println(list);

        Lists.removeThird(list);
        Lists.removeEvil(list);
        System.out.println(list);

        System.out.println(Lists.generateSquare());

        System.out.println(Lists.contains(list, 3));

        ArrayList<Integer> newlist = new ArrayList<Integer>(List.of(3,5,8,5,1));
        Lists.copy(list, newlist);
        System.out.println(newlist);

        Lists.reverse(list);
        System.out.println(list);

        Lists.reverseManual(list);
        System.out.println(list);

        LinkedList<Integer> l_list = new LinkedList<Integer>(List.of(5,6,7,8));
        Lists.insertBeginningEnd(l_list,10);
        System.out.println(l_list);
    }
}
