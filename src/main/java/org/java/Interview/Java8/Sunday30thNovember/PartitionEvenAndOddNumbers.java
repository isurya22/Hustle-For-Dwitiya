package org.java.Interview.Java8.Sunday30thNovember;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenAndOddNumbers {
    //Partition a list into Even and Odd numbers

    public static void main(String[] args) {
        List<Integer> numbers = List.of(41,44,47,12,50,30,11);
        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(s -> s % 2 == 0));
        System.out.println(collect);
    }
}
