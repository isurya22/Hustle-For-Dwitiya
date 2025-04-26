package org.java.fundamentals.Revision.GenericClass;

public class MultipleGeneric<String, Integer> {

    private String name;
    private Integer age;

    public void getDetails(){
        System.out.println("Name of the Student: "+name);
        System.out.println("Age of the Student: "+age);
    }

    public void setDetails(String name, Integer age){
        this.name = name;
        this.age = age;
    }
}
