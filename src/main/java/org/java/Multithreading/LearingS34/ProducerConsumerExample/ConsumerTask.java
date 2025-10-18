package org.java.Multithreading.LearingS34.ProducerConsumerExample;

public class ConsumerTask implements Runnable{
     SharedResource sharedResource;

     ConsumerTask(SharedResource resource){
         this.sharedResource = resource;
     }

    @Override
    public void run() {
        System.out.println("Thread : "+ Thread.currentThread().getName());
        sharedResource.consumeItem();
    }
}
