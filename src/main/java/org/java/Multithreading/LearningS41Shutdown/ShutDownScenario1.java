package org.java.Multithreading.LearningS41Shutdown;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutDownScenario1 {
    public static void main(String[] args) {
        ExecutorService poolObj = Executors.newFixedThreadPool(5);
        poolObj.submit(()->
            System.out.println("Thread is going to start its work")
        );
        //Task submission after submission
        poolObj.shutdown();

        poolObj.submit(()->
            System.out.println("Thread is going")
        );
    }
}
