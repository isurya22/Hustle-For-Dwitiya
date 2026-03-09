package org.java.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prcatice1On9thMarch {
    //Find Second-Highest Number in the list of numbers

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,23,3,13,8);
        int secondHighestNumber  = list.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(()->new RuntimeException("No second highest number"));
        System.out.println("Second Highest Number:  "+secondHighestNumber);
    }

}
