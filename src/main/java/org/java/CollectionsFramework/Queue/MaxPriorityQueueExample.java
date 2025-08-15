package org.java.CollectionsFramework.Queue;

import java.util.PriorityQueue;

public class MaxPriorityQueueExample {
    public static void main(String[] args) {

        //Why it is called Max Priority coz in constructor we are passing comparator or value.
        PriorityQueue<Integer> values = new PriorityQueue<>((Integer a, Integer b)->b-a);
        values.add(15);
        values.add(8);
        values.add(20);
        values.add(58);

        values.forEach((Integer value)-> System.out.println(value));

        while(!values.isEmpty()){
             int number = values.poll();
            System.out.println("REMOVE Number is " + number);
        }
    }
}
