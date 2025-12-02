package org.java.Interview.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Saturday29Question2 {
    //Remove duplicate elements from a list

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,3,4,5,66,66,3,1,8);
        List<Integer> distinct = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);
    }
}
