package org.java.Interview.Java8;

import java.util.Arrays;
import java.util.List;

public class Monday24Question1 {
    public static void main(String[] args) {
        List<Integer> listOfNumber = Arrays.asList(3,46,24,11,1,7,25,42);
        listOfNumber.stream().filter(number->number%2==0).forEach(System.out::println);
    }
}
