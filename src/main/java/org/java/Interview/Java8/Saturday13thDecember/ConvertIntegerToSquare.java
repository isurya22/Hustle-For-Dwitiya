package org.java.Interview.Java8.Saturday13thDecember;

import java.util.Arrays;
import java.util.List;

public class ConvertIntegerToSquare {
    //Convert a list of Integer to their square values

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        List<Integer> squareValues = numbers.stream().map(n->n*n).toList();
        System.out.println(squareValues);
    }
}
