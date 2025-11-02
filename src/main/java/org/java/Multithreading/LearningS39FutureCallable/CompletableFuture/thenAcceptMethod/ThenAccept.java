package org.java.Multithreading.LearningS39FutureCallable.CompletableFuture.thenAcceptMethod;

import java.util.concurrent.*;

public class ThenAccept {
    public static void main(String[] args) {

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //thenAccept has no return type.
        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(()-> {
            System.out.println("Sri");
            return "S";
        },poolExecutor).thenAccept((String val)-> {
            System.out.println("Ram");
        });

        try {
            System.out.println("Result : " + completableFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
