package org.java.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice1On7thMarch {
    public static void main(String[] args) {
        //Find Second-Highest Number in the list of numbers
        List<Integer> list = Arrays.asList(7,3,23,4,25);
        int secondHighestNumbers = list.stream().sorted(Comparator
                .reverseOrder()).skip(1).findFirst().orElseThrow(()->new RuntimeException("No second Highest numbers"));
        System.out.println(secondHighestNumbers);
    }
}
