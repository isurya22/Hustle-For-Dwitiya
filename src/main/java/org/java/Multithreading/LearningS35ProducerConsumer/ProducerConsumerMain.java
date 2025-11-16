package org.java.Multithreading.LearningS35ProducerConsumer;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        SharedValues sharedValues = new SharedValues(3);

        //creating producer thread using lambda expression
        Thread producerThread = new Thread(()->{
            try{
                for (int i = 0; i<=10; i++){
                    sharedValues.produceItem(i);
                }
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
            }
        });

        //creating consumer thread using lambda expression
        Thread consumerThread = new Thread(()->{
            try{
                for (int i = 0; i<=10; i++){
                    sharedValues.consumeItem();
                }
            } catch (Exception ex){
                System.out.println(ex.getStackTrace());
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
