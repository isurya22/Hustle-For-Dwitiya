package org.java.Interview.Java8;

import java.util.Arrays;
import java.util.List;

public class FindtheStartingNumber6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,12,22,5,63,7,52,59);

        System.out.println("4) Find out all numbers starting with 6 using stream");

        numbers.stream().filter(s->s.toString().startsWith("5")).forEach(System.out::println);
    }
}
