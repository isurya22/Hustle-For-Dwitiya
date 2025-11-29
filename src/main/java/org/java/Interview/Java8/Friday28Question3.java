package org.java.Interview.Java8;

import java.util.List;

public class Friday28Question3 {
    //Find the minimum number from the list

    public static void main(String[] args) {
        List<Integer> numberLists = List.of(21,6,28,9,53,25);
        int min = numberLists.stream().mapToInt(Integer::intValue).min().orElseThrow();
        System.out.println(min);
    }
}
