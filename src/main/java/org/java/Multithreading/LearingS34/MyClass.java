package org.java.Multithreading.LearingS34;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Going inside the main method: "+Thread.currentThread().getName());
        MyThreadRunnableClass runnableClass = new MyThreadRunnableClass();
        Thread thread = new Thread(runnableClass);
        thread.start();
        System.out.println("Finish main method: "+Thread.currentThread().getName());
    }
}
