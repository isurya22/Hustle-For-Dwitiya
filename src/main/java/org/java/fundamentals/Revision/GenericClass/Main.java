package org.java.fundamentals.Revision.GenericClass;
//This class used for MultipleGeneric.
public class Main {
    public static void main(String[] args) {
        MultipleGeneric<String,Integer> objec1 = new MultipleGeneric<>();
        objec1.setDetails("Ram",22);
        objec1.getDetails();
    }
}
