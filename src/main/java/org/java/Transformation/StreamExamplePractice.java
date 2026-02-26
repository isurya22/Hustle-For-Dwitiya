package org.java.Transformation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamExamplePractice {
    //Find the second-highest number in a list

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(54,33,21,76,12);
        int secondHighest = numberList.stream().distinct()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst() //findFirst() return Optional object, if we will print than Optional[54].
                .orElseThrow(()->new RuntimeException("No second highest number"));
        //secondHighest.ifPresent(System.out::println);
        //System.out.println(secondHighest);
        System.out.println(secondHighest);
    }
}
