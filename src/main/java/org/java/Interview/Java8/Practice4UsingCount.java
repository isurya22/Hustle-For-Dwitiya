package org.java.Interview.Java8;

import java.util.Arrays;
import java.util.List;

public class Practice4UsingCount {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,12,22,5,63,7);

        System.out.println("2) Given the list of integers, find the total number of elements present in the list using Stream function.");

        System.out.println(numbers.stream().count());
    }
}
