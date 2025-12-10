package org.java.Interview.Java8.Tuesday9thDecember;

import java.util.List;

public class RemoveEmptyString {
    //Remove empty strings from a list
    public static void main(String[] args) {
        List<String> words = List.of("box","","Jira","","GitLab");
        List<String> result = words.stream().filter(s->!s.isEmpty()).toList();
        System.out.println(result);
    }
}
