package org.java.Interview.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Saturday29Question1 {
    //Count the number of Strings starting with a specific letter

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","Naga","Shiva","Jaswant","ashwin");
        java.util.List<String> strings = words.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
        System.out.println(strings);
        long counts = words.stream().filter(s->s.startsWith("a")).count();
        System.out.println(counts);
    }
}
