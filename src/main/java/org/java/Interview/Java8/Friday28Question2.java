package org.java.Interview.Java8;

import java.util.List;

public class Friday28Question2 {
    //Find the maximum number in list

    public static void main(String[] args) {
        List<Integer> numbers = List.of(21,28,11,50,9);
        int maxNumber = numbers.stream().mapToInt(Integer::intValue).max().orElseThrow();
        System.out.println(maxNumber);
    }
}
