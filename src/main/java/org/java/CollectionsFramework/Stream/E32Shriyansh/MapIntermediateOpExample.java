package org.java.CollectionsFramework.Stream.E32Shriyansh;

import java.util.Arrays;
import java.util.stream.Stream;

public class MapIntermediateOpExample {
    public static void main(String[] args) {
        //Learning how many ways Intermediate operations are available

        String[] nameStream = {"HELLO","HOW","ARE","YOU","DOING"};
        Stream<String> nameList = Arrays.stream(nameStream);
        nameList.map((String s)->s.toLowerCase()).forEach((String s)-> System.out.println(s));
    }
}
