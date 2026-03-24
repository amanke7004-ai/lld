package com.multithreading;

import javax.sound.midi.SysexMessage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class LeakyBucket{
    private int capacity;
    private int currentRequests;
    private int leakRatePerSecond;
    private long lastLeakTime;

    public LeakyBucket(int capacity, int leakRatePerSecond){
        this.capacity = capacity;
        this.leakRatePerSecond = leakRatePerSecond;
        this.currentRequests = 0;
        this.lastLeakTime = System.currentTimeMillis();
    }

    public synchronized boolean allowRequest(){
        leak();
        if(currentRequests < capacity){
            currentRequests++;
            return true;
        }else{
            return false;
        }
    }

    private void leak() {
        int secondsElapsedUntilLastLeak = (int) (System.currentTimeMillis() - lastLeakTime) / 1000;
        int leakedRequests = this.leakRatePerSecond * secondsElapsedUntilLastLeak;
        if (leakedRequests > 0) {
            currentRequests = Math.max(0, currentRequests - leakedRequests);
            lastLeakTime = System.currentTimeMillis();
        }
    }
}

public class LeakyBucketThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        LeakyBucket leakyBucket = new LeakyBucket(5,1);
        Runnable task = ()->{
            if(leakyBucket.allowRequest()){
                System.out.println("Request processed");
            }else{
                System.out.println("Request Rejected");
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 0; i <= 200; i++){
            executorService.execute(task);
            Thread.sleep(500);
        }
        executorService.shutdown();
        boolean taskFinished = executorService.awaitTermination(10, TimeUnit.SECONDS);
        if(!taskFinished){
            System.out.println("All tasks not finished");
        }
    }
}
