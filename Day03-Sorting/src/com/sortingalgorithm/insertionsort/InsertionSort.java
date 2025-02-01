package com.sortingalgorithm.insertionsort;

public class InsertionSort {
    //insertion method to sort array
    public void insertionSort(int [] arr){
        int len = arr.length;
        int key,j;

        for(int i=1;i<len;i++){
            key = arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    //method to print sorted array
    public void printId(int [] arr){
        System.out.println("---Employee id in ascending order using insertion sort---");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
