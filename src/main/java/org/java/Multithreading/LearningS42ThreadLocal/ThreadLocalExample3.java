package org.java.Multithreading.LearningS42ThreadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalExample3 {
    public static void main(String[] args) {
        new ThreadLocalExample3();
    }

    ThreadLocal<String> threadLocalObj = new ThreadLocal<>();

    ExecutorService poolObj = Executors.newFixedThreadPool(5);

    public ThreadLocalExample3() {
        poolObj.submit(()-> {
            threadLocalObj.set(Thread.currentThread().getName());
            //my work completed, now clean up
            threadLocalObj.remove();
        });

        for (int i = 1; i<15; i++){
            poolObj.submit(()-> {
                System.out.println(threadLocalObj.get());
            });
        }
    }
}
