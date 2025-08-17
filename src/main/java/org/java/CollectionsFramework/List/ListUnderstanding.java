package org.java.CollectionsFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ListUnderstanding {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        //add
        list1.add(0,18);
        list1.add(1,8);
        list1.add(2,4);

        //addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(0,21);
        list2.add(1,63);
        list2.add(2,75);

        list1.addAll(2,list2);
        list1.forEach((Integer i)-> System.out.println(i));

        //sort using comparator
        list1.sort((Integer val1, Integer val2)->val1-val2);
        list1.forEach((Integer val)-> System.out.println("After sorting the values: "+val));
    }
}
