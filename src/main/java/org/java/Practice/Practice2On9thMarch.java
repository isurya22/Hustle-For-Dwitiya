package org.java.Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice2On9thMarch {
    public static void main(String[] args) {
        //Find all duplicate element in a List

        List<Integer> numbersList = Arrays.asList(10,4,57,4,9,3,23,10);

        Set<Integer> uniqueNumbers = new HashSet<>();
        numbersList.stream().filter(e->!uniqueNumbers.add(e))
                .forEach(e->System.out.println("Duplicate Number: "+e));
    }
}
