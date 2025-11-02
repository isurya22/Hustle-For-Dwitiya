package org.java.Multithreading.LearningS39FutureCallable.CompletableFuture.thenAcceptMethod;

import java.util.concurrent.*;

public class ThenAcceptAsyncMain {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //thenAccept has no return type.
        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(()-> {
            System.out.println("Thread initiated by : "+ Thread.currentThread().getName());
            System.out.println("Maa");
            return "Maa";
        },poolExecutor).thenAcceptAsync((String val)-> {
            System.out.println("Thread Received by : "+ Thread.currentThread().getName());
            System.out.println("Saraswati");
        });

        try {
            System.out.println("Result : " + completableFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}