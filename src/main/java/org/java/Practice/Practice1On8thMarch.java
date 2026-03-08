package org.java.Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice1On8thMarch {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = Arrays.asList(16,8,38,2,28);
        int secondHighestNumber = listOfNumbers.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(()->new RuntimeException("No Second Highest Number"));
        System.out.println("Second Highest Number: " + secondHighestNumber);
    }
}
