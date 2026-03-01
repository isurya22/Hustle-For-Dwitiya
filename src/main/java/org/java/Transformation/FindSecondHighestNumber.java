package org.java.Transformation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighestNumber {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(12,46,59,18,30);
        int secondHighestNumber = numberList.stream().distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElseThrow();
        System.out.println(secondHighestNumber);

    }
}
