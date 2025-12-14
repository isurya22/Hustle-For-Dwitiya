package org.java.Interview.Java8.Saturday13thDecember;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilterOutNullValue {
    //Filter null values from a list

    public static void main(String[] args) {
        List<String> lists = Arrays.asList("1",null,"Jaga","4",null);
        List<String> results = lists.stream().filter(Objects::nonNull).toList();
        System.out.println(results);
    }
}
