package org.java.Interview.Java8;

import java.util.Arrays;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,12,22,5,63,7);

        System.out.println("1) Given the list of integers, find the first element of list using Stream function.");

        numbers.stream().findFirst().ifPresent(System.out::println);

    }
}
