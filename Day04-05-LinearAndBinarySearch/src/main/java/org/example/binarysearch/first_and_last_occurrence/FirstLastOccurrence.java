package org.example.binarysearch.first_and_last_occurrence;

public class FirstLastOccurrence {
    //creating method to find first occurrence
    public static int firstOccurrence(int[] arr,int target){
        int first = -1;
        // creating low variable to store the starting index of array
        int low =0;
        //creating high variable to store the last index of the array
        int high = arr.length-1;
        //using while loop to traverse over the array
        while(low<=high){
            // calculating mid key
            int mid = low + (high-low)/2;

            //condition to find first occurrence of target value
            if(arr[mid]==target){
                first = mid;
                high = mid -1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return first;
    }
    //method to calculate the last occurrence
    public static int lastOccurrence(int[] arr, int target){
        // initializing variable last with -1 to store the index of last variable
        int last = -1;
        // creating variable low to store the starting index of an array
        int low = 0;
        // creating variable high to store the last index of an array
        int high = arr.length;
        //using while loop to traverse over the array
        while(low<=high){
            // calculating mid key
            int mid = low + (high-low)/2;

            //condition to find last occurrence of target value
            if(arr[mid]==target){
                last = mid;
                low = mid+1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return last;
    }
    public static void main(String[] args){
        //creating an array
        int[] arr = {2,3,4,5,6,6,7,8};
        int target = 6;
        //calling static method
        int resultFirst = firstOccurrence(arr,target);
        int  resultLast = lastOccurrence(arr,target);

        if(resultFirst!= -1 && resultLast!= -1){
            System.out.println("First occurrence is at index: " + resultFirst);
            System.out.println("Last occurrence is at index: " + resultLast);
        }
        else{
            System.out.println("First and last occurrence is not found at any index");
        }
    }
}
