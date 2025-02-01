package com.sortingalgorithm.mergesort;

import java.util.*;

public class BookPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //taking input from user
        System.out.print("Enter the number of books: ");
        int books = sc.nextInt();

        //creating array of book size
        int[] arr = new int[books];
        for(int i= 0;i<books;i++){
            System.out.print("Book " + (i+1) + "Price is: ");
            arr[i] = sc.nextInt();
        }
        //creating  object
        MergeSort ms = new MergeSort();
        //calling method
        ms.mergeSort(arr,0,books-1);
        ms.printBookPrice(arr);
    }
}
