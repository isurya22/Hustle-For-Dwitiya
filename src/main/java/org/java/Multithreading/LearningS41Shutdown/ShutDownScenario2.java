package org.java.Multithreading.LearningS41Shutdown;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutDownScenario2 {
    public static void main(String[] args) {
        ExecutorService poolObj = Executors.newFixedThreadPool(5);
        poolObj.submit(()->{
            try{
                Thread.sleep(5000);
                System.out.println("Submit Thread");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("Main Thread");
        });

        poolObj.shutdown();

        System.out.println("Main thread unblocked and finished processing......");
    }
}
