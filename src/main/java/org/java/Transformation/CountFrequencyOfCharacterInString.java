package org.java.Transformation;

import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfCharacterInString {
    //Count the frequency of character in a string
    public static void main(String[] args) {

        String word = "Suryanarayan";

        Map<Character, Long> result = word.toLowerCase().chars()
                .mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(result);

    }
}
