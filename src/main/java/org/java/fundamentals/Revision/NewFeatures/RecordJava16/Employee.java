package org.java.fundamentals.Revision.NewFeatures.RecordJava16;

public class Employee {
    public static void main(String[] args) {
        User user1 = new User("Vivek",23);

        System.out.println(user1.name()+ "," + user1.age());

        System.out.println(user1);
    }
}
