package org.java.Interview.Java8.Sunday30thNovember;

import java.util.Comparator;
import java.util.List;

public class FindSecondLargestNumber {
    //Get the second-largest number in a list

    public static void main(String[] args) {
        List<Integer> numbers = List.of(13,30,11,50,53);
        int result = numbers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElseThrow();
        System.out.println(result);
    }
}