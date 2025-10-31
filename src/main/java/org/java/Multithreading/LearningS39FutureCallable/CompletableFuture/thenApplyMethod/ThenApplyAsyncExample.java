package org.java.Multithreading.LearningS39FutureCallable.CompletableFuture.thenApplyMethod;

import java.util.concurrent.*;

public class ThenApplyAsyncExample {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<?> completableFuture = CompletableFuture.supplyAsync(()-> {
            try{
                System.out.println("ThreadName of SupplyAsync : " + Thread.currentThread().getName());
                Thread.sleep(5000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return "Jay Jagannath";
            },poolExecutor).thenApplyAsync((String val)-> {
            System.out.println("ThreadName of thenApplyAsync : " + Thread.currentThread().getName());
                return "Swamy";
        });

        //poolExecutor.shutdown();
    }
}
