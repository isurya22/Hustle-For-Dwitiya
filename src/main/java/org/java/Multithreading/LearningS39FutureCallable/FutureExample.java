package org.java.Multithreading.LearningS39FutureCallable;

import java.util.Arrays;
import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        Future<?> futureObj = executor.submit(()-> {
            try{
                Thread.sleep(7000);
                System.out.println("this is the task, which thread will execute.");
            } catch (Exception ex){
                System.out.println(Arrays.toString(ex.getStackTrace()));
            }
        });

        //Here we are checking task is completed or not.
        System.out.println("Task is Done: " + futureObj.isDone());

        //this will wait if required, for at most the given timeout period. Throws "TimeoutException" if timeout period finished and task is not yet completed.
        try{
            futureObj.get(2,TimeUnit.SECONDS);

        } catch (TimeoutException e) {
            System.out.println("TimeoutException happened");
        }
        catch (Exception ignored){
        }

        //Here we are checking the task, it will wait till the task is completed.
        try{
            futureObj.get();
        } catch (Exception ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }

        System.out.println("Task is Done: " + futureObj.isDone());
        System.out.println("is cancelled: "+ futureObj.isCancelled());
    }
}
