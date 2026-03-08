package org.java.Practice;

import java.util.Map;
import java.util.stream.Collectors;

public class Practice3On8thMarch {
    public static void main(String[] args) {
        String word = "Vivek";
        Map<Character, Long> duplicateCharacter = word.toLowerCase().chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(duplicateCharacter);
    }
}
