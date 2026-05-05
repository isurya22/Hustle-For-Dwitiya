package org.java.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeOn5thMay {
    //Count the frequency of element in list of Strings
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple","orange","apple","grapes","Orange");
        Map<String, Long> counting = stringList.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(counting);
    }

}
