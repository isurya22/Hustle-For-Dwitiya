package org.java.Multithreading.LearningS39FutureCallable.CompletableFuture.ThanComposeMethod;

import java.util.concurrent.*;

public class ThanComposeMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<?> completableFuture = CompletableFuture.supplyAsync(()-> {
            return "Hello";
        },poolExecutor).thenCompose((String val) -> {
            return CompletableFuture.supplyAsync(()-> {
                return val + "Fool";
            });
        });
        System.out.println(completableFuture.get());
    }
}
