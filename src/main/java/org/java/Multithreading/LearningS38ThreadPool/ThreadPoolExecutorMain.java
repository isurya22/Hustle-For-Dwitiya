package org.java.Multithreading.LearningS38ThreadPool;

import java.util.Arrays;
import java.util.concurrent.*;

public class ThreadPoolExecutorMain {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), new CustomThreadFactory(), new CustomRejectedExecutionHandler());

        //This method is used to keep the idle thread alive till 10 Minutes which passed in Constructor reference.
        executor.allowCoreThreadTimeOut(true);

        // Here we passed 7 tasks
        for(int i = 1; i <= 7; i++){
            executor.submit(()->{
                try{
                    Thread.sleep(5000);
                    //System.out.println("Task created after 5 seconds : " + Thread.currentThread().getName());
                } catch (Exception ex){
                    System.out.println(Arrays.toString(ex.getStackTrace()));
                }
                System.out.println("Task processed by : " + Thread.currentThread().getName());
            });
        }
        //shutdown is used Stop accepting new tasks, but finish all tasks that are already submitted.
        executor.shutdown();
    }
}

//Custom ThreadFactory
class CustomThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
        return th;
    }
}

//Custom RejectedExecutorHandler
class CustomRejectedExecutionHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Thread Rejected : " + r.toString());
    }
}