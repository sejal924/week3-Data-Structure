package org.example.binarysearch.peak_element;

public class PeakElement {
    //method to find the peak element
    public static int findingPeakElement(int[] arr){
        //creating variable low to store the starting index of an array
        int low =0;
        //creating variable high to store the last index of an array
        int high = arr.length-1;

        //using while loop to traverse the array
        while(low<high){
            //calculating mid key
            int mid = low+(high-low)/2;

            //condition to find peak element(grater than its neighbour)
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                  return arr[mid];
            }
            else if(arr[mid]<arr[mid-1]){
                high = mid-1;
            }
            else if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
       // creating array
        int[] arr = {2,3,4,5,6,7,6};
        //calling method
        int result = findingPeakElement(arr);
        System.out.println("Peak element in an array is: " +result);
    }
}
