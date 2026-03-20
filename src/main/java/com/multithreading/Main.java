package com.multithreading;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] arr = new int[]{9, 7, 9, 8, 2, 6, 0, 3, 9, 2};
        int left = 0;
        int right = arr.length-1;
        ExecutorService mergeExecutorService = Executors.newCachedThreadPool();
        MergeSort mergeSort = new MergeSort(mergeExecutorService, arr, left, right);
        Future<int[]> futureAns = mergeExecutorService.submit(mergeSort);
        int[] sortedArr = futureAns.get();
        System.out.println("Sorted Arr : " + Arrays.toString(sortedArr));
    }
}
