package org.java.Multithreading.LearningS42ThreadLocal;

public class ThreadLocalExample1 {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();

        //main Thread
        threadLocalObj.set(Thread.currentThread().getName());

        Thread thread1 = new Thread(()-> {
            threadLocalObj.set(Thread.currentThread().getName());
            System.out.println("Task1");
        });

        thread1.start();

        try {
            Thread.sleep(5000);
        } catch (Exception ex) {
            //Handle Thread
        }

        //here we have main thread
        System.out.println("Main Thread : " + threadLocalObj.get());
    }
}
