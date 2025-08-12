package org.java.CollectionsFramework.Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(23);
        values.add(32);
        values.add(55);
        values.add(11);

        System.out.println(values);

        //Size
        System.out.println(values.size());

        //isEmpty
        System.out.println(values.isEmpty());

        //contains
        System.out.println(values.contains(5));

        //toArray
        //add
        System.out.println(values.add(15));
        System.out.println("Added one number in collections :"+values);

        //remove
        System.out.println(values.remove(0));
        System.out.println("After remove number from collection :"+values);

        //addAll
        Stack<Integer> numbers = new Stack<>();
        numbers.add(45);
        numbers.add(32);
        numbers.add(10);

        System.out.println(values.addAll(numbers));
        System.out.println("After added new collections with Value collection :"+values);

        //containsAll
        System.out.println(values.containsAll(numbers));

        //removeAll
        System.out.println(values.removeAll(numbers));
        System.out.println("After remove collection of numbers :"+values);

        //clear
        values.clear();

        System.out.println("clear the collection: "+values);
    }
}
