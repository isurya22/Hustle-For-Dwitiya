package org.java.Multithreading.LearingS34;

public class MyClassCall {
    public static void main(String[] args) {
        System.out.println("Going inside the main method: "+ Thread.currentThread().getName());
        MyThreadClass myThreadClass = new MyThreadClass();
        myThreadClass.start();
        System.out.println("Finish main method: "+ Thread.currentThread().getName());
    }
}
