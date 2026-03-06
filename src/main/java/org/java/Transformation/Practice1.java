package org.java.Transformation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        //Find the second-highest number
        List<Integer> numberList = Arrays.asList(6,22,10,50,3);
        int secondHighestNumber = numberList.stream().distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst()
                .orElseThrow(()->new RuntimeException("No second Highest Number"));
        System.out.println(secondHighestNumber);
    }
}
