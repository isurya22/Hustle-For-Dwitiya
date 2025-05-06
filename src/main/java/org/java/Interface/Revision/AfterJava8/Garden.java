package org.java.Interface.Revision.AfterJava8;

public interface Garden {

    void plantation();

    /*
        After Java 8 onwards, Default method comes in Interface. So we can implement a method.
        NOTE:- This is default method don't think it is abstract method.
     */
    default void winterPlantation(){
        System.out.println("Winter season plantation");
    }
}
