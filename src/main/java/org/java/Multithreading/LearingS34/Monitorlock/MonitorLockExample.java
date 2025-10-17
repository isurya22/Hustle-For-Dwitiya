package org.java.Multithreading.LearingS34.Monitorlock;

public class MonitorLockExample {

    public  synchronized void task1(){
        System.out.println("Enter synchronized Block");
        try{
            System.out.println("inside the task1");
            Thread.sleep(5000);
        } catch (Exception ex){
            System.out.println(ex.getStackTrace());
        }
    }

    public void task2(){
        System.out.println("task2, but before synchronized");
        synchronized (this){
            System.out.println("task2, inside synchronized");
        }
    }

    public void task3(){
        System.out.println("inside task3");
    }

}
