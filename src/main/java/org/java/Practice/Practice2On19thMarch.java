package org.java.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice2On19thMarch {
    //Find the second-highest number in a List

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,10,50,21,3);
        int result = list.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(()->new RuntimeException("No second Highest Number"));
        System.out.println(result);
    }
}
