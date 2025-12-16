package org.java.Interview.Java8.Tuesday16thDecember;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilterOutNullValuePractice1 {
    //Filter null values from a list
    public static void main(String[] args) {
        //List<String> numberLists = List.of("1","2",null); --> Does not allow null elements. In compile no problem when you will run the program you will get NullPointerException.
        List<String> numberLists = Arrays.asList("1","2",null);
        java.util.List<String> stringList = numberLists.stream().filter(Objects::nonNull).toList();
        System.out.println(stringList);
    }
}
