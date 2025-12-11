package org.java.Interview.Java8.Thursday11thDecmber;

import java.util.List;

public class ListMatchesCondition {
    //Check if any element in the list matches a condition

    public static void main(String[] args) {
        List<Integer> nums = List.of(1,3,5,9);
        boolean hasEven = nums.stream().anyMatch(n->n%2 == 0);
        System.out.println(hasEven);
    }
}
