package org.java.Interview.Java8.Thursday11thDecmber;

import java.util.List;

public class ElementsMatchCondition {
    //Check if all elements match a condition
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,4,6);
        boolean hasEven = numbers.stream().allMatch(n->n%2 == 0);
        System.out.println(hasEven);
    }
}
