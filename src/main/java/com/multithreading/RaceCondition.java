package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Number implements  Runnable{
    private int num;
    public Number(int num){
        this.num = num;
    }
//use synchronized keyword to prevent race condition
    private  void increment(){
        num++;
        System.out.println("Num :: " + num);
    }
    public int getNum(){
        return num;
    }
    @Override
    public void run(){
        increment();
    }

}
public class RaceCondition {
    public static void main(String[] args) throws  InterruptedException {
        Number number = new Number(0);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0; i < 100; i++){
            executorService.submit(number);
        }
        executorService.shutdown();
        boolean finished = executorService.awaitTermination(10, TimeUnit.MINUTES);
        if(!finished){
            System.out.println("Not all tasks finished");
        }
        int result = number.getNum();
        System.out.println("RESULT :: " + result);
    }
}
