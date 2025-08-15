package org.java.CollectionsFramework.Queue;

import java.util.PriorityQueue;

public class MinPriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> value = new PriorityQueue<>(); //Why it is called Min because here we provided nothing in constructor
        value.add(15);
        value.add(8);
        value.add(20);
        value.add(4);

        for (Integer number : value) {
            System.out.println(number);
        }

        while (!value.isEmpty()) {
            int total = value.poll();
            System.out.println("REMOVE THE VALUE: "+ total);
        }
    }
}
