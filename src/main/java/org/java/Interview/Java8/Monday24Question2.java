package org.java.Interview.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Monday24Question2 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(21,10,23,36,24,11,25);
        java.util.List<Integer> integerList = numbersList.stream().filter(number->number%2 != 0).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
