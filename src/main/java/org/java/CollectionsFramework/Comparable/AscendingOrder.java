package org.java.CollectionsFramework.Comparable;


import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        Integer[] values = {16,8,20,25,12,53};
        Arrays.sort(values, (Integer val1, Integer val2) -> val1-val2);

        for (int number : values){
            System.out.println("Number is :"+number);
        }
    }
}
