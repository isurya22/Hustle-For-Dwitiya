package org.java.CollectionsFramework.Comparable;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
       Integer[] values = {16,8,20,25,13,39};
        Arrays.sort(values, (val1, val2)-> val2-val1);

        for (int numbers : values){
            System.out.println(numbers);
        }
    }
}
