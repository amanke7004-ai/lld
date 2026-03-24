package com.multithreading;


//class OddEvenNumberPrinter{
//    private int oddNum;
//    private int evenNum;
//    private boolean canPrintOddNum;
//    private int maxNum;
//
//
//    public OddEvenNumberPrinter(int oddNum, int evenNum, boolean canPrintOddNum, int maxNum){
//        this.oddNum = oddNum;
//        this.evenNum = evenNum;
//        this.canPrintOddNum = canPrintOddNum;
//        this.maxNum = maxNum;
//    }
//
//    public synchronized void printEvenNum() throws InterruptedException {
//        while(canPrintOddNum){
//            wait();
//        }
//        if(evenNum <= maxNum) {
//            System.out.println("Event Num :: " + evenNum + " " + Thread.currentThread().getName());
//            Thread.sleep(1000);
//            evenNum += 2;
//            canPrintOddNum = true;
//            notify();
//        }else{
//            canPrintOddNum = false;
//        }
//    }
//
//    public synchronized void printOddNum() throws InterruptedException {
//        while(!canPrintOddNum){
//            wait();
//        }
//        if(oddNum <= maxNum) {
//            System.out.println("Odd Num :: " + oddNum + " " + Thread.currentThread().getName());
//            Thread.sleep(1000);
//            oddNum += 2;
//            canPrintOddNum = false;
//            notify();
//        }else{
//            canPrintOddNum = true;
//        }
//    }
//}

class NumPrinter {
    private int num;
    private int maxNum;

    public NumPrinter(int num, int maxNum) {
        this.num = num;
        this.maxNum = maxNum;
    }

    public synchronized void printEventNum() throws InterruptedException {
        while (num <= maxNum) {
            while (num % 2 == 1) {
                wait();
            }
            if(num > maxNum){
                break;
            }
            System.out.println("Even Number :: " + num +  " , "  +Thread.currentThread().getName());
            Thread.sleep(1000);
            num += 1;
            notify();
        }
    }

    public synchronized void printOddNum() throws InterruptedException {
        while(num <= maxNum) {
            while (num % 2 == 0) {
                wait();
            }
            if(num > maxNum){
                break;
            }
            System.out.println("Odd Number :: " + num +  " , "  + Thread.currentThread().getName());
            Thread.sleep(1000);
            num += 1;
            notify();
        }
    }


}


public class OddEvenNumberPrinter {
//    public static void main(String[] args) {
//        System.out.println("Program started...");
//        int eventNumStart = 2;
//        int oddNumStart = 1;
//        int maxNum = 9;
//        boolean canPrintOddNum = true;
//        OddEvenNumberPrinter oddEvenNumberPrinter = new OddEvenNumberPrinter(oddNumStart, eventNumStart, canPrintOddNum, maxNum);
//
//        Runnable task = ()->{
//            try {
//                oddEvenNumberPrinter.printOddNum();
//                oddEvenNumberPrinter.printEvenNum();
//
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        };
//        ExecutorService executorService = Executors.newFixedThreadPool(1);
//        for(int i = 0; i <= 100; i++){
//            executorService.execute(task);
//        }
//        executorService.shutdown();
//    }


    public static void main(String[] args) throws InterruptedException {
        NumPrinter numPrinter = new NumPrinter(1, 10);
        Thread oddThread = new Thread(() -> {
            try {
                numPrinter.printOddNum();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Thread evenThread = new Thread(() -> {
            try {
                numPrinter.printEventNum();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        evenThread.setName("evenThread");
        oddThread.setName("oddThread");
        oddThread.start();
        evenThread.start();
        oddThread.join();
        evenThread.join();
    }
}








/*
Create 2 threads:


One prints even numbers

One prints odd numbers

 1  2  3  4  5
 The output should follow this pattern:


For n = 5, output:
Constraints:

Use synchronization to ensure the correct order.

 */
