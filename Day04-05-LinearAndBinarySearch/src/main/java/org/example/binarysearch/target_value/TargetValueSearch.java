package org.example.binarysearch.target_value;
import java.util.*;

public class TargetValueSearch {
    //method to find the target value
    public static boolean findingTargetValue(int[][] arr,int row,int column,int target){
        int len = arr.length;
        // creating low variable to store the starting index of array
       int low =0;
        //creating high variable to store the last index of the array
       int high = row*column-1;

        //using while loop to traverse over the array
       while(low<=high){
           //calculating mid key
           int mid = low + (high - low)/2;

           int rows = mid/len;
           int col = mid% len;
           //condition to find whether the target value is present or not
           if(arr[rows][col]==target){
               return true;
           }
           else if(arr[rows][col]>target){
               high = mid-1;
           }
          else{
             low = mid+1;
           }
       }
       return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //taking number of rows and column from user
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of column: ");
        int column = sc.nextInt();

        //creating an array
        int[][] arr = new int[row][column];
        //taking the number in an array from user
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = 5;
        //calling method
        boolean result = findingTargetValue(arr,row,column,target);
        System.out.println("Targeted value is found: " + result);

    }
}
