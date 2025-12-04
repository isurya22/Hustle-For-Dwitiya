package org.java.Interview.Java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Saturday29Question4 {

    //Sort a list in descending order
    public static void main(String[] args) {
        List<Integer> numbers = List.of(9,1,3,6,2,8);
        List<Integer> numberLists = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(numberLists);
    }
}
