package org.java.Multithreading.LearningS39FutureCallable.CallableDeepUnderstandingBoundle;

import java.util.List;

public class MyRunnableClass implements Runnable{

    List<Integer> list;

    MyRunnableClass(List<Integer> list){
        this.list = list;
    }

    @Override
    public void run() {
       list.add(300);
    }
}
