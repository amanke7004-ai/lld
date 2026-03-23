package com.multithreading;

import java.util.Arrays;
import java.util.concurrent.*;

public class Main {

    //printing numbers from 1 to n using different thread

//    public static void main(String[] args) {
//        Runnable runnable = new SumCalculator(5);
//        System.out.println("Thread name : " + Thread.currentThread().getName());
//
//        SumCalculator sumCalculator = new SumCalculator(4);
//        Thread t = new Thread(runnable);
//        t.start();//task 1
//        sumCalculator.calculateSum();//task2
//
//
//
//
//    }


    //printing numbers from 1 to n using different thread
//    public static void main(String[] args) {
////        for(int num = 1; num <= 10; num++){
////            Thread t = new NumberPrinter(num);
////            t.start();
////        }
//
//        //Above task but using fixed number of Threads using Executors
//
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        for(int num = 1; num <= 100; num++){

    /// /            executorService.submit(new NumberPrinter(num));//takes both Runnable and Callable(returning value is possible)
//                executorService.execute(new NumberPrinter(num));//takes only Runnable, not Callable (returning value is not possible)
//        }
//    }

//calculate fibonaccinumber using different thread and Callable
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        //use of newFixedThreadPool with insufficient number of threads may cause deadlock.
//        //so using newCachedThreadPool.
//        ExecutorService fiboExecutorService = Executors.newCachedThreadPool();//doesn't take fixed number of threads
//        Future<Integer> futureAns = fiboExecutorService.submit(new FiboNacciNumbers(6, fiboExecutorService));
//        int ans = futureAns.get();
//        System.out.println("FiboNacci number : " + ans);
//    }


    // Merge sort using multi-threading

//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        int[] arr = new int[]{9, 7, 9, 8, 2, 6, 0, 3, 9, 2};
//        int left = 0;
//        int right = arr.length-1;
//        ExecutorService mergeExecutorService = Executors.newCachedThreadPool();
//        MergeSort mergeSort = new MergeSort(mergeExecutorService, arr, left, right);
//        Future<int[]> futureAns = mergeExecutorService.submit(mergeSort);
//        int[] sortedArr = futureAns.get();
//        System.out.println("Sorted Arr : " + Arrays.toString(sortedArr));
//    }


    // Quick sort using multi-threading

//    public static void main(String[] args) throws Exception{
//        System.out.println("Program started...");
//        int[] arr = new int[]{9, 7, 9, 8, 2, 6, 0, 3, 9, 2};
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        Future<int[]> sortingTask = executorService.submit(new QuickSort(arr, 0, arr.length-1, executorService));
//        sortingTask.get();
//        System.out.println("Sorted Arr :: " + Arrays.toString(arr));
//        executorService.shutdown();
//    }


    // Thread join
//    public static void main(String[] args) throws Exception{
//        System.out.println("Program started...");
//        Thread t1 = new Thread(()->{
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Task 1 completed");
//        });
//        Thread t2 = new Thread(()->{
//            try {
//                Thread.sleep((2000));
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Task 2 completed");
//        });
//
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();// writing it causes main thread to wait until t1 and t2 finish execution.
//        System.out.println("Program finished...");//main thread finished execution;
//    }

    public static void main(String[] args) throws Exception{

        // similar case of awaitTermination when using ExecutorService

        System.out.println("Program started...");
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> task1 = executorService.submit(()->{
            try{
                Thread.sleep(4000);
                System.out.println("Task1 finished");
            }catch(Exception e){
                e.printStackTrace();
            }
            return -1;
        });
        Future<Integer> task2 = executorService.submit(()->{
            try{
                Thread.sleep(4000);
                System.out.println("Task2 finished");
            }catch(Exception e){
                e.printStackTrace();
            }
            return -1;
        });
        executorService.shutdown();// stops taking new tasks and completes ongoing tasks
        boolean allTasksFinished = executorService.awaitTermination(5, TimeUnit.SECONDS);// will wait for 5 seconds for
        //since we've only waited for 5 seconds, it will return false as task2 was not able to complete in the 5 seconds time.
        if(!allTasksFinished){
            System.out.println("Not all tasks finished");
        }
        System.out.println("Program finished...");
    }
}
