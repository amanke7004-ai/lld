package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class TokenBasedRateLimiter {
    private int tokens;
    private long lastRefillTime;
    private int capacity;
    private long refillRatePerSecond;
    
    public TokenBasedRateLimiter(int capacity, long refillRatePerSecond){
        this.capacity = capacity;
        this.tokens = capacity;
        this.refillRatePerSecond = refillRatePerSecond;
        this.lastRefillTime = System.currentTimeMillis();
    }
    
    public synchronized String processRequest(){
        refill();
        if(this.tokens > 0){
            this.tokens--;
            return "Request Processed";
        }else{
            return "Request Rejected";
        }
    }
    private void refill(){
        int timeElapsedInSeconds = (int)(System.currentTimeMillis()-lastRefillTime)/1000;
        int tokensToAdd = 0;
        if(timeElapsedInSeconds > 0){
            tokensToAdd = (int)(timeElapsedInSeconds * refillRatePerSecond);
            this.tokens = Math.min(capacity, this.tokens + tokensToAdd);
            lastRefillTime = System.currentTimeMillis();
        }

    }
}

public class ThreadSafeTokenRateLimiter{

    public static void main(String[] args) throws InterruptedException {
        TokenBasedRateLimiter tokenBasedRateLimiter = new TokenBasedRateLimiter(4,1);
        Runnable task = ()->{
            String result = tokenBasedRateLimiter.processRequest();
            System.out.println(result);
        };
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i = 0; i <= 200; i++) {
            Thread.sleep(100);
            executorService.execute(task);
        }
        executorService.shutdown();
        boolean taskFinished = executorService.awaitTermination(10, TimeUnit.SECONDS);
        if(!taskFinished){
            System.out.println("All tasks not finished");
        }
    }
}


