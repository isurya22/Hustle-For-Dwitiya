package org.java.Interview.Java8.Tuesday16thDecember;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EighteenNumberChallenge {
    //Find the average of a list of numbers

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4);
        double result = numberList.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(result);
    }
}
