package org.java.Multithreading.LearingS34.ProducerConsumerExample;

public class ProduceTask implements Runnable{

    SharedResource sharedResource;

    ProduceTask(SharedResource resource){
        this.sharedResource = resource;
    }

    @Override
    public void run() {
        System.out.println("Produce Thread: "+ Thread.currentThread().getName());
         try{
             Thread.sleep(5000);
         } catch (Exception ex) {
             System.out.println(ex.getStackTrace());
         }

         sharedResource.addItem();
    }
}
