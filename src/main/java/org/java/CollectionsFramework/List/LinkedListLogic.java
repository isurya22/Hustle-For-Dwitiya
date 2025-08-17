package org.java.CollectionsFramework.List;

import java.util.LinkedList;

public class LinkedListLogic {
    public static void main(String[] args) {
        LinkedList<Integer> element = new LinkedList<>();

        //using deque functionality
        element.addFirst(32);
        element.addFirst(22);
        element.addFirst(18);
        element.addFirst(25);
        System.out.println(element.getFirst());

        //using List functionality
        LinkedList<Integer> elements = new LinkedList<>();
        elements.add(0,100);
        elements.add(1,300);
        elements.add(2,600);
        elements.add(1,2025);
        System.out.println(elements.get(1)+"..."+elements.get(2));
    }
}
