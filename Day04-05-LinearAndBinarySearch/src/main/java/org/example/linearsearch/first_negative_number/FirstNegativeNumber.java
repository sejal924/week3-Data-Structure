package org.example.linearsearch.first_negative_number;

public class FirstNegativeNumber {
    public static int findingNegativeNumber(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,4,6,7,8,-2,-8,-9};
        int index = findingNegativeNumber(arr);
        if(index !=-1){
            System.out.println("The first negative number is at index: " + index);
        }
        else{
            System.out.println("The negative number is not found");
        }
    }
}
