package org.java.Interview.Comparable.PracticeDay1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class College {
    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        student.add(new Student("Durgesh", 28, "Kanpur"));
        student.add(new Student("Rosalin",27,"Swargapur"));
        student.add(new Student("Arshlan",20,"Alipur"));

        System.out.println("Before Sorting : "+ student);
        Collections.sort(student);
        System.out.println("After sorting: "+ student);
    }
}
