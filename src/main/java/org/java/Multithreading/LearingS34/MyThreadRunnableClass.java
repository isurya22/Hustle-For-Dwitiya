package org.java.Multithreading.LearingS34;

public class MyThreadRunnableClass implements Runnable{
    @Override
    public void run() {
        System.out.println("Implementing Runnable interface: "+Thread.currentThread().getName());
    }
}
