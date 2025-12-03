package org.java.Interview.Java8;

import java.util.List;
import java.util.stream.Collectors;

public class Saturday29Question3 {
    //Sort a List in ascending Order

    public static void main(String[] args) {
        List<Integer> numbers = List.of(8,2,5,1,6,4);
        java.util.List<Integer> numberList = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(numberList);
    }
}
