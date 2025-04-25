package org.java.fundamentals.Revision.NonPrimitiveClass;

public class School {
    public static void main(String[] args) {
        Class classOne = new Class();
        classOne.StudentId = 24;
        classOne.TeacherId = 2;
        classOne.whichStandards();
        System.out.println(classOne.StudentId);
        System.out.println(classOne.TeacherId);
    }
}
