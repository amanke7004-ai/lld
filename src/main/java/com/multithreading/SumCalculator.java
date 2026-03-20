package com.multithreading;


//By implementing Runnable interface

public class SumCalculator implements  Runnable{
    private int n;

    public SumCalculator(int n){
        this.n = n;
    }
    public void calculateSum(){
        long sum = 0;
        for(int num = 1; num <= this.n; num++){
            sum += num;
        }
        System.out.println("Sum of first n numbers : " + sum);
        System.out.println("Thread name : " + Thread.currentThread().getName());
    }

    //Runnable interface's run method doesn't return anything.
    @Override
    public void run() {
        calculateSum();
    }
}
