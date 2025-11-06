package org.java.Multithreading.LearningS41Shutdown;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationExample {
    public static void main(String[] args) {
       ExecutorService poolObj = Executors.newFixedThreadPool(5);
       poolObj.submit(()->{
           try{
               Thread.sleep(8000);
           } catch (Exception ex){
               System.out.println(Arrays.toString(ex.getStackTrace()));
           }
       });

       poolObj.shutdown();

        try {
            boolean isExecutorTerminated = poolObj.awaitTermination(3, TimeUnit.SECONDS);
            System.out.println("Main thread , isExecutorTerminated : "+ isExecutorTerminated);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}