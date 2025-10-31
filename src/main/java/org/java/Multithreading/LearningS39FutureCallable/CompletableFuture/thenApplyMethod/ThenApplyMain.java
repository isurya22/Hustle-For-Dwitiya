package org.java.Multithreading.LearningS39FutureCallable.CompletableFuture.thenApplyMethod;

import java.util.concurrent.*;

public class ThenApplyMain {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()-> "Namah Parvathi Patayeh",
                poolExecutor).thenApply((String val)-> val + "  Har Har Mahadev");

        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        poolExecutor.shutdown();
    }
}
