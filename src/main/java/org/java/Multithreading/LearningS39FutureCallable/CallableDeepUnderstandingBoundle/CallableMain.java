package org.java.Multithreading.LearningS39FutureCallable.CallableDeepUnderstandingBoundle;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableMain {
    public static void main(String[] args) {

        //ThreadPool Created
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,3,1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        /*UseCase1
              Using submit method with Runnable
         */
        Future<?> futureObj = threadPoolExecutor.submit(()-> System.out.println("First task completed."));

        try{
            Object object = futureObj.get(); //Thread will Line 17 task should complete
            System.out.println(object == null);
        } catch (Exception exception){
            //handle Exception
        }

        /*
        UseCase2
        Using submit method with Future<T> submit(Runnable task, T result)
         */
        List<Integer> integerList = new ArrayList<>(); //Result
        Future<List<Integer>> futureObj2 = threadPoolExecutor.submit(new MyRunnableClass(integerList), integerList); //Here we passed customized RunnableClass and Result

        try{
            futureObj2.get();
            //1 way print object
            System.out.println(integerList.get(0));

            //2 way print object
            List<Integer> result = futureObj2.get();
            System.out.println(result.get(0));
        } catch (Exception ex) {
            //handle exception
        }

        /*
        UseCase3
        Using submit method with Future<T> submit(Callable<T> task)
         */
         Future<List<Integer>> futureObj3 = threadPoolExecutor.submit(()-> {
             List<Integer> output = new ArrayList<>();
             output.add(12);
             return output;
         });

         try{
             List<Integer> result = futureObj3.get();
             System.out.println(result.get(0));
         } catch (Exception exception){
             //handle exception
         }



    }
}
