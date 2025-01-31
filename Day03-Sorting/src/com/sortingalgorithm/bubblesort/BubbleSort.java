package com.sortingalgorithm.bubblesort;


class BubbleSort {
    //creating method to sort the student marks
      public void bubbleSort(int []studentsMarks,int students){
          boolean swap= false;
          //using bubble sort for sorting
          for(int i =0;i<students-1;i++){
              for(int j =0;j<students-i-1;j++){
                  if(studentsMarks[j] > studentsMarks[j+1]){
                     int temp = studentsMarks[j];
                      studentsMarks[j] = studentsMarks[j+1];
                      studentsMarks[j+1] = temp;
                      swap = true;
                  }
              }
              if(swap!= true){
                  break;
              }
          }
      }
      //creating method to print student marks
      public void printStudentMarks(int []studentsMarks,int students){
          System.out.println("---Student marks in ascending order using bubble sort---");
              for(int i=0;i<students;i++){
                  System.out.print(studentsMarks[i] + " ");
              }
      }

}