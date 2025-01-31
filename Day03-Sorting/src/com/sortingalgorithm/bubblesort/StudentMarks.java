package com.sortingalgorithm.bubblesort;

import java.util.*;

//creating class StudentMarks
public class StudentMarks {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Student: ");
        //taking input from user
        int students = sc.nextInt();
        int[] studentsMarks = new int[students];
        //taking marks of student from user
        for (int i = 0; i < students; i++) {
            System.out.print("Enter the marks of student" + (i + 1) + ": ");
            studentsMarks[i] = sc.nextInt();
        }
        //creating object
        BubbleSort bs = new BubbleSort();

        //calling method
        bs.bubbleSort(studentsMarks,students);
        bs.printStudentMarks(studentsMarks,students);
    }
}