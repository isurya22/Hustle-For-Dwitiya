package org.java.Multithreading.LearningS39FutureCallable.CompletableFuture.SupplyAsyncMethod;

import java.util.concurrent.*;

public class SupplyAsyncExample {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //Here we used supplyAsync with two parameters supplier and executor
        CompletableFuture<String> asyncTask = CompletableFuture.supplyAsync(()-> {
            //System.out.println("Task");
            return "Task Completed";
        },poolExecutor);

        try {
            System.out.println(asyncTask.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        //used to shut down the thread
        poolExecutor.shutdown();
    }
}
