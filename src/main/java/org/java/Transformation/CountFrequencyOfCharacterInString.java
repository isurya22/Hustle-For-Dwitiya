package org.java.Transformation;

import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfCharacterInString {
    //Count the frequency of character in a string
    public static void main(String[] args) {

        String word = "Suryanarayan";

        Map<Character, Long> result = word.toLowerCase()
                .chars()                  //converts the string into an IntStream of characters
                .mapToObj(c->(char)c) //converts integer values to Character objects
                .collect(Collectors.groupingBy(c->c,Collectors.counting())); //groups the same characters.
        System.out.println(result);

    }
}
