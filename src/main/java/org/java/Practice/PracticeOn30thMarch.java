package org.java.Practice;

import java.util.Map;
import java.util.stream.Collectors;

public class PracticeOn30thMarch {
    public static void main(String[] args) {
        String word = "Suryanarayan";
        Map<Character, Long> result = word.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(result);
    }
}
