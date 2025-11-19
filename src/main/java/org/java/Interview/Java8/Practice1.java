package org.java.Interview.Java8;

import java.util.List;
import java.util.stream.Collectors;

///Separate "Al" word from the list.

public class Practice1 {
    public static void main(String[] args) {
        List<String> names = List.of("Al","Alice","Bob","Ben");
        List<String> results = names.stream().filter(s->s.length()<=2).collect(Collectors.toList());
        System.out.println(results);
    }
}
