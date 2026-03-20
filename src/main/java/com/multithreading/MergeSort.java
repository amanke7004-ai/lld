package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<int[]> {
    private ExecutorService executorService;
    int[] arr;
    int left;
    int right;
    MergeSort(ExecutorService executorService, int[] arr, int left, int right){
        this.executorService = executorService;
        this.arr = arr;
        this.left = left;
        this.right = right;
    }
    private void merge(int[] arr, int left, int mid, int right){
        System.out.println(" left : " + left + " right : " + right + "Thread name : " + Thread.currentThread().getName());
        int[] leftArr = new int[mid-left+1+1];
        int[] rightArr = new int[right-mid+1];
        for(int i = 0; i < leftArr.length-1; i++){
            leftArr[i] = arr[left+i];
        }
        for(int j = 0; j < rightArr.length-1; j++){
            rightArr[j] = arr[mid+1+j];
        }
        leftArr[leftArr.length-1] = Integer.MAX_VALUE;
        rightArr[rightArr.length-1] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int k = left;
        while(k <= right){
            if(leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            }else{
                arr[k++] = rightArr[j++];
            }
        }
    }
    @Override
    public int[] call() throws Exception {
        if(left < right) {
            int mid = left + (right - left) / 2;
            Future<int[]> task1 = executorService.submit(new MergeSort(this.executorService, arr, this.left, mid));
            Future<int[]> task2 = executorService.submit(new MergeSort(this.executorService, arr, mid + 1, this.right));
            task1.get();
            task2.get();
            merge(arr, this.left, mid, this.right);
        }
        return this.arr;
    }
}