package com.multithreading;

// By Extending Thread class and overriding run method
public class NumberPrinter extends Thread{
    private int num;

    NumberPrinter(int num){
        this.num = num;
    }

    private void printNum(){
        System.out.println(num + "    Thread : " + Thread.currentThread().getName());
    }


    @Override
    public void run() {
        printNum();
    }
}
