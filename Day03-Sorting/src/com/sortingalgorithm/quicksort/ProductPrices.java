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
