package org.java.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice1On17thMarch {
    //#Find the second-highest number in a List
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(17,3,20,9,52,27);
        int secondHighestNumber = list.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(()->new RuntimeException("No second highest Number"));

        System.out.println(secondHighestNumber);
    }
}
