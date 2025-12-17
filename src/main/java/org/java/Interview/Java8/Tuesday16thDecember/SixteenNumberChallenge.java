package org.java.Interview.Java8.Tuesday16thDecember;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SixteenNumberChallenge {
    //Collect stream results into a set instead of List

    public static void main(String[] args) {
        List<Integer> numberLists = Arrays.asList(1,5,5,2,3,4);
        Set<Integer> results = numberLists.stream().collect(Collectors.toSet());
        System.out.println(results);
    }
}
