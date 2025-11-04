package org.java.Multithreading.LearningS40ExecutorsMethodWithFrokJoinPool.WorkStealingPoolExample;

import java.util.concurrent.RecursiveTask;

public class ComputeSumTask extends RecursiveTask<Integer> {

    int start;
    int end;
    ComputeSumTask(int start,int end){
        this.start = start;
        this.end = end;
    }

    //Override the method
    @Override
    protected Integer compute() {
        if(start - end <= 4){
            int totalSum = 0;
            for (int i = start; i <= end; i++){
                totalSum += i;
            }
            return totalSum;
        } else {

            //Split the task
            int mid = (start + end) / 2;
            ComputeSumTask leftTask = new ComputeSumTask(start, mid);
            ComputeSumTask rightTask = new ComputeSumTask(mid + 1, end);

            //Fork the subtasks for Parallel execution;
            leftTask.fork();
            rightTask.fork();

            //Combine the results of subtasks
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();

            //combine the result
            return leftResult + rightResult;
        }

    }
}
