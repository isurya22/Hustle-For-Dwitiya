package org.java.fundamentals.Revision.ConcreteClass;

public class Person {
    int age;

    Person(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Person person = new Person(30);
        System.out.println(person.getAge());
        System.out.println(person.age);
    }
}
