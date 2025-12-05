package org.java.Interview.Java8;

import java.util.Arrays;
import java.util.List;

public class Saturday29Question5 {
    //Find the first element of a list
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("a","c","d");
        String e = elements.stream().findFirst().orElseThrow(); //findFirst method return Optional
        System.out.println(e);
    }
}