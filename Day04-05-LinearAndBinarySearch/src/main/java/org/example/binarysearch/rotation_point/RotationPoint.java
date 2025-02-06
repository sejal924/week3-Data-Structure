package org.example.binarysearch.rotation_point;

public class RotationPoint {
    //method to find the rotation point in an sorted array
    public static int findingRotatedPoint(int [] arr){
        //variable low to store the first index of an array
         int low = 0;
         //variable high to store the last index of an array
         int high = arr.length-1;

         //using while loop to traverse through an array
         while(low<high){
             //calculating mid key
             int mid = low + (high-low)/2;

            if(arr[mid]>arr[high]){
                 low = mid+1;
             }
             else if(arr[mid]<arr[high]){
                 high = mid;
             }
         }
         //condition to check for rotated point
         if(low==high){
             return low;
         }
         return -1;
    }
    public static void main(String[] args){
        //creating sorted array
         int[] sortedArray= {8,7,6,5,4,3,2};
         System.out.println("The index of the smallest element: " + findingRotatedPoint(sortedArray));
    }
}
