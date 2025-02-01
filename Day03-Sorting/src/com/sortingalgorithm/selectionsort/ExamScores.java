package com.sortingalgorithm.selectionsort;
import java.util.*;
public class ExamScores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int student = sc.nextInt();
        int[] arr = new int[student];

        for(int i=0;i<student;i++){
            System.out.print("Student"+(i+1)+" score is: ");
            arr[i]=sc.nextInt();
        }

        SelectionSort ss = new SelectionSort();
        ss.selectionSort(arr);
        ss.printArray(arr);
    }
}
