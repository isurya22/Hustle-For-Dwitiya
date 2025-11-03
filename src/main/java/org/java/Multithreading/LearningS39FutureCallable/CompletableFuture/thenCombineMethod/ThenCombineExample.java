package org.java.Multithreading.LearningS39FutureCallable.CompletableFuture.thenCombineMethod;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenCombineExample {
    public static void main(String[] args) {

        CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(()-> {return 150;});

        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(()-> {return "K";});

        CompletableFuture<String> completableFutureResult = completableFuture1.thenCombine(completableFuture2, (Integer i, String j) -> i + j);

        try {
            System.out.println(completableFutureResult.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}