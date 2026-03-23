package com.multithreading;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


// Here the producer is faster than the consumer, so the queue will get filled up and the producer will wait for the consumer to consume the data.
class Producer1 implements  Runnable{
    private int num;
    BlockingQueue<Integer> queue;
    public Producer1(BlockingQueue<Integer> queue, int num){
        this.queue = queue;
        this.num = num;
    }

    @Override
    public void run(){
        while(true){
            try{
                queue.put(num);
                System.out.println("Produced :: " + num);
                num++;
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Consumer1 implements Runnable{

    private BlockingQueue<Integer> queue;

    public Consumer1(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        while(true){
            try{
                int num = queue.take();
                System.out.println("Consumed :: " + num);
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


}
public class BufferedPubSub {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        Producer1 producer1 = new Producer1(queue, 1);
        Consumer1 consumer1 = new Consumer1(queue);
        Thread producerThread = new Thread(producer1);
        Thread consumerThread = new Thread(consumer1);
        producerThread.start();
        consumerThread.start();
    }
}
