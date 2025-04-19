package org.java.fundamentals.Practice.Constructor;
/*
  Example of Super()
 */

public class Student extends Teacher{
    int age;
    String name;

    Student(){
        super("Nandi Sir");
        System.out.println("Free Demo class");
    }
}
