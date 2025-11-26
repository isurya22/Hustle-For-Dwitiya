package org.java.Interview.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Monday24Question3 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("surya","ANURAG","jayanta","Abinash");
        java.util.List<String> nameLists = nameList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(nameLists);
    }
}
