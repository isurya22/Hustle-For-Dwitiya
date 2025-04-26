package org.java.fundamentals.Revision.GenericClass;

public class UsingGeneric<T> {

    T name;

    public String getName(){
        return (String) name;
    }

    public void setName(T name){
        this.name = name;
    }

    public static void main(String[] args) {
        UsingGeneric<String> object1 = new UsingGeneric<String>();
        object1.setName("Anjali");
        String name = object1.getName();
        System.out.println(name);
    }
}
