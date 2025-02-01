package com.sortingalgorithm.insertionsort;
import java.util.*;

public class EmployeeID {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        //taking input from user
         int employeeID = sc.nextInt();
         //creating array of size number of employee
         int[] arr = new int[employeeID];
         for(int i =0;i<employeeID;i++ ){
             System.out.print("Employee " +(i+1) + " id is: ");
             arr[i]= sc.nextInt();
         }
         //creating object
        InsertionSort insertion = new InsertionSort();

         //calling method
         insertion.insertionSort(arr);
         insertion.printId(arr);
    }
}
