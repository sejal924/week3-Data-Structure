package com.sortingalgorithm.quicksort;
import java.util.*;

public class ProductPrices {
    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the product: ");
         int product = sc.nextInt();

         int [] arr = new int[product];
         for(int i =0;i<product;i++){
             System.out.print("Enter product"+(i+1) + " price ");
             arr[i] = sc.nextInt();
         }
         QuickSort qs = new QuickSort();
         qs.quickSort(arr,0,product-1);
         qs.printPrice(arr);
    }
}
import java.util.Arrays;
class CountSort {
    public static int[] countSort(int[] inputArray) {
        int N = inputArray.length;
        int M = 0;
        for (int i = 0; i < N; i++) {
            M = Math.max(M, inputArray[i]);
        }
        int[] countArray = new int[M + 1];
        for (int i = 0; i < N; i++) {
            countArray[inputArray[i]]++;
        }
        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }
        int[] outputArray = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }
        return outputArray;
    }
}
import java.util.Arrays;
class CountSort {
    public static int[] countSort(int[] inputArray) {
        int N = inputArray.length;
        int M = 0;
        for (int i = 0; i < N; i++) {
            M = Math.max(M, inputArray[i]);
        }
        int[] countArray = new int[M + 1];
        for (int i = 0; i < N; i++) {
            countArray[inputArray[i]]++;
        }
        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }
        int[] outputArray = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }
        return outputArray;
    }
}

public class SortStudentAges7 {
    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 18, 12, 14, 10, 13, 17, 16, 15, 10};
        int[] sortedAges = CountSort.countSort(ages);
        System.out.println(Arrays.toString(sortedAges));
    }
}
