package org.example.searching;
import java.util.*;

public class Linear_And_Binary_Search {
    public static int linearSearch(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1000,10000,1000000};
        for(int i=0;i<3;i++){
            int[] newArr = new int[arr[i]];
            for(int j=0;j<newArr.length;j++){
                newArr[j]=(j+1);
            }
            double start ,end;
             start = System.nanoTime();
            int result = linearSearch(newArr,30);
             end = System.nanoTime();
            if(result!=-1){
                System.out.println("Time taken by linear search: " + (end - start)/1000 + "ms");
                System.out.println("Target found: " + result);
            }
            else{
                System.out.println("Target not found" );
            }

             start = System.nanoTime();
            int result1 = binarySearch(newArr,30);
             end = System.nanoTime();

            if(result1!=-1){
                System.out.println("Time taken by binary search: " + (end - start)/1000 + "ms");
                System.out.println("Target found: " +result1);
            }
            else{
                System.out.println("Target not found");
            }
        }
        }
}
