package org.java.Multithreading.LearingS34;

public class MyThreadClass extends Thread{
    @Override
    public void run(){
        System.out.println("Extending Thread Class: "+Thread.currentThread().getName());
    }
}
