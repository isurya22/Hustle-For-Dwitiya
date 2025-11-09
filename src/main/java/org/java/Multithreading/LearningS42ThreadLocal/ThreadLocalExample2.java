package org.java.Multithreading.LearningS42ThreadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalExample2 {
      ThreadLocal<String> threadLocalObj = new ThreadLocal<>();

      ExecutorService poolObj = Executors.newFixedThreadPool(5);

      public ThreadLocalExample2(){
          poolObj.submit(()-> {
              threadLocalObj.set(Thread.currentThread().getName());
          });

          for(int i=1; i<15; i++){
              poolObj.submit(()-> {
                  System.out.println(threadLocalObj.get());
              });
          }
      }

    public static void main(String[] args) {
        new ThreadLocalExample2();
    }
}
