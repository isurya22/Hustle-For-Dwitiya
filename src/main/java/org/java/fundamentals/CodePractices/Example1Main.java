package org.java.fundamentals.CodePractices;

public class Example1Main {
    public static void main(String[] args) {
        Example1 example1 = new Example1();
        example1.setStudentDetails("Anurag","Balasore", 83);
        Example1 example2 = new Example1();
        example2.setStudentDetails("Minaketan","Anugul",26);
        Example1 example3 = new Example1();
        example3.setStudentDetails("Devi","Berhampur",12);

        example1.getStudentDetails();

    }
}
