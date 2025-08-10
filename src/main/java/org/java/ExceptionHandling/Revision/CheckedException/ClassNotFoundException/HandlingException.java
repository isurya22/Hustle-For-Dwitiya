package org.java.ExceptionHandling.Revision.CheckedException.ClassNotFoundException;

public class HandlingException {
    public static void main(String[] args) {
        method2();
    }
    public static void method2(){
        try{
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
