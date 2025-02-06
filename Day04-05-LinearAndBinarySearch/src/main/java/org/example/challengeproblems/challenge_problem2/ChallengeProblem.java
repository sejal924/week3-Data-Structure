package org.example.challengeproblems.challenge_problem2;
import java.util.*;
public class ChallengeProblem {
    //method find first positive missing number
    public static int linearSearch(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int firstMissing = 1;
        Arrays.sort(arr);
        //using for loop to find positive number
        for(int i=0;i<arr.length;i++){
            if(arr[i]==firstMissing){
                firstMissing++;
            }
        }
        return firstMissing;
    }
    //method to find target value index
    public static int binarySearch(int[] arr , int target){
        int low = 0;
        int high = arr.length-1;
        //using while loop to traverse over an array
        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {-4,-3,-2,1,6,7,8,9};
        System.out.println("First positive missing number:" + linearSearch(arr));
        int target = 6;
        int result = binarySearch(arr,target);
        if(result!=-1){
            System.out.println("Target value is at index: " + result);
        }
        else{
            System.out.println("Target value is not found");
        }
    }
}
