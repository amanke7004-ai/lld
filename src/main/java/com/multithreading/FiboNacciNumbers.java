package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class FiboNacciNumbers implements Callable<Integer> {
    private int num;
    private ExecutorService executorService;
    public FiboNacciNumbers(int num, ExecutorService executorService){
        this.num = num;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws ExecutionException, InterruptedException {
        System.out.println("Fib Num Calculation :: " + this.num + "Thread name : " + Thread.currentThread().getName());
        if(this.num <= 1){
            return this.num;
        }
        Future<Integer> future1 = this.executorService.submit(new FiboNacciNumbers(num-1, executorService));
        Future<Integer> future2 = this.executorService.submit(new FiboNacciNumbers(num-2, executorService));
        int future1Result = future1.get();
        int future2Result = future2.get();
        return future1Result + future2Result;
    }
}
