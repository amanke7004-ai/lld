package com.multithreading;

import java.util.concurrent.*;
import java.util.Arrays;


class QuickSort implements Callable<int[]>{
    private int[] arr;
    private int left;
    private int right;
    private ExecutorService executorService;

    public QuickSort(int[] arr, int left, int right, ExecutorService executorService){
        this.arr = arr;
        this.left = left;
        this.right = right;
        this.executorService = executorService;
    }

    private int partition(int[] arr, int left, int right){
        int pivotElement = arr[right];// setting last element as the pivot element.
        // all elements to the left of pivot will be less than or equal to pivot and vice versa
        int i = left-1;
        for(int j = left; j < right; j++){
            if(arr[j] <= pivotElement){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+1;
    }

    private void quickSort(int[] arr, int left, int right){

    }
    @Override
    public int[] call() throws Exception{
        if(left < right){
            int pivot = partition(arr, left, right);
            Future<int[]> leftTask = executorService.submit(new QuickSort(arr, left, pivot-1, executorService));
            Future<int[]> rightTask = executorService.submit(new QuickSort(arr, pivot+1, right, executorService));
            leftTask.get();
            rightTask.get();    // has to wait, otherwise the array might not get sorted as this run asynchronously apart from main thread
        }
        return arr;
    }
}