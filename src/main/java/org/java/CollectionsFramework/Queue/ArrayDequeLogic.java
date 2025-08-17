package org.java.CollectionsFramework.Queue;

import java.util.ArrayDeque;

public class ArrayDequeLogic {
    public static void main(String[] args) {
        ArrayDeque<Integer> elements = new ArrayDeque<>();
        elements.addLast(3);
        elements.addLast(9);
        elements.addLast(17);

        System.out.println(elements);

        //Deletion from last
        int element = elements.removeLast();
        System.out.println(element);

        System.out.println(elements);

        //add First
        elements.addFirst(23);
        System.out.println(elements);

        //Deletion from first
        elements.removeFirst();
        System.out.println(elements);
    }
}
