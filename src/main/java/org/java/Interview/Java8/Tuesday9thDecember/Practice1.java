package org.java.Interview.Java8.Tuesday9thDecember;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice1 {
    //Get the second-largest number from the list

    public static void main(String[] args) {
        List<Integer> numberLists = Arrays.asList(22,7,9,12,8);
        int value = numberLists.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
        System.out.println(value);
    }
}
