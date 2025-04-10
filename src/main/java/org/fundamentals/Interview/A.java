package org.fundamentals.Interview;

//Q:- Why only one public class in Java file/can we have two public classes in one Java file?
/*
   1. Main method should present inside public class file
   2. Public class name should be same as file name.

   Naming Convention:
   The Java compiler requires that the name of the public class matches the name of the file. If you had two public classes, which one would the file be named after?

   Compilation Unit:
   A Java source file is considered a single compilation unit. A compilation unit can only have one public class that serves as the entry point for that unit.
 */
public class A {
    String name;
    int age;

    public static void main(String[] args) {
        A a = new A();
        a.name = "Surya";
        System.out.println(a.name);
    }

}

//Below we haven't mention public Class B, if we do then it will show an error i.e. Class should be declared in a file named B.java
class B {
    String VillageName;
    int villageCode;

    public static void main(String[] args) {
        B b = new B();
        b.villageCode = 234;
        System.out.println(b.villageCode);
    }
}

