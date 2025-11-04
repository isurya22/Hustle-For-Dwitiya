package org.java.Multithreading.LearningS40ExecutorsMethodWithFrokJoinPool.WorkStealingPoolExample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class ExecutorsUtilitySample {
    public static void main(String[] args) {

        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        Future<Integer> futObject = forkJoinPool.submit(new ComputeSumTask(0,100));
        try {
            futObject.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
