package org.java.Interview.Java8;

import java.util.Arrays;
import java.util.List;

public class Friday28Question1 {
    //Find the sum of all numbers in a list

    public static void main(String[] args) {
        List<Integer> numberLists = Arrays.asList(1,2,3,4,5);
        int result = numberLists.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result);
    }


}
