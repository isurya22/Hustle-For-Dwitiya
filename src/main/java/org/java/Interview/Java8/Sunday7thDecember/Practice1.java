package org.java.Interview.Java8.Sunday7thDecember;

import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        List<Integer> numberLists = List.of(3,12,7,52,55,8);
        List<Integer> result = numberLists.stream().sorted().toList();
        System.out.println(result);
    }
}
