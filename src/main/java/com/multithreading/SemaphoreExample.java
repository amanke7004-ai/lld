package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

class Task implements Runnable{

    private Semaphore semaphore;
    public Task(Semaphore semaphore){
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " waiting");
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " permitted");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " releasing permit");
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class SemaphoreExample {
    public static void main(String[] args) {
        ExecutorService executorService  = Executors.newFixedThreadPool(2);
        Thread t = new Thread(new Task(new Semaphore(1)));
        for(int i = 0; i <= 10; i++){
            executorService.execute(t);
        }
    }
}
