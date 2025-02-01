package com.sortingalgorithm.heapsort;
import java.util.*;
public class JobApplicants {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employee: ");
        int  employee = sc.nextInt();

        int arr[] = new int[employee];
        for(int i=0;i<employee;i++){
            System.out.println("Enter the salary of employee"+(i+1)+" ");
            arr[i] = sc.nextInt();
        }
        HeapSort hs = new HeapSort();
        hs.heapSort(arr);
        hs.printArray(arr);
    }
}