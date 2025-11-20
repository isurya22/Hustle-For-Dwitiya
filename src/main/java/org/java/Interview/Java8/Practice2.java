package org.java.Interview.Java8;

import java.util.List;
import java.util.stream.Collectors;

public class Practice2 {
    public static void main(String[] args) {
        List<String> randomNames = List.of("Romy","Nutan","Gum","Ezi");
        List<String> result = randomNames.stream().filter(s->s.length() > 3).collect(Collectors.toList());
        System.out.println(result);
    }
}
