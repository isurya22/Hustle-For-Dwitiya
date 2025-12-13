package org.java.Interview.Java8.Thursday11thDecmber;

import java.util.Arrays;
import java.util.List;

public class CheckNoElements {

    //Check if no elements match a condition
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat","dog");
        boolean noneLongerThan5 = words.stream().noneMatch(s->s.length() > 5);
        System.out.println(noneLongerThan5);
    }
}
