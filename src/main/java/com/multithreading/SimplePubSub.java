package com.multithreading;

//Important Note: We cannot call wait/modify wait() in non-synchronized method

class Counter{
    private int num;
    private boolean canWrite;

    Counter(int num, boolean canWrite){
        this.num = num;
        this.canWrite = canWrite;
    }

    public synchronized void write() throws InterruptedException {
        while(!canWrite){
            wait();
        }
        this.num++;
        System.out.println("Write :: " + num);
        canWrite = false;
        notify();
    }

    public synchronized void read() throws InterruptedException {
        while(canWrite){
            wait();
        }
        System.out.println("Read :: " + num);
        canWrite = true;
        notify();
    }
}



class Producer implements Runnable{
    private Counter counter;
    public Producer(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        while(true){
            try {
                counter.write();
                Thread.sleep(5000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}



class Consumer implements Runnable{
    private Counter counter;

    public Consumer(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        while(true){
            try{
                counter.read();
                Thread.sleep(2000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}


public class SimplePubSub{
    public static void main(String[] args) {
        System.out.println("Program started...");
        Counter counter = new Counter(0, true);
        Producer producer = new Producer(counter);
        Consumer consumer = new Consumer(counter);
        Thread producerThread = new Thread((producer));
        Thread consumerThread = new Thread((consumer));
        producerThread.start();
        consumerThread.start();
    }
}