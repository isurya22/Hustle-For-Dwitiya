package org.java.Multithreading.LearningS39FutureCallable.CompletableFuture.ThanComposeMethod;

import java.util.concurrent.*;

public class ThenComposeAsyncMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<?> completableFuture = CompletableFuture.supplyAsync(()-> {
            return "Hello";
        },poolExecutor).thenComposeAsync((String val) -> {
            return CompletableFuture.supplyAsync(()-> {
                return val + " Indrani";
            });
        }).thenComposeAsync((String val2)-> {
            return CompletableFuture.supplyAsync(()-> {
                return val2 + " Ji";
            });
        });
        System.out.println(completableFuture.get());
    }
}
