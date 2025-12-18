package org.java.Interview.Java8.Tuesday16thDecember;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeventeenNumberChallenge {
    //Join list of strings into a single comma-separated string

    public static void main(String[] args) {
        List<String> numberOfWords = Arrays.asList("Hello","my","Java","World");
        java.lang.String word = numberOfWords.stream().collect(Collectors.joining());
        System.out.println(word);
    }
}
