package org.example.comparing_datastructures;
import java.util.*;
public class Array_HashSet_TreeSet {
    public static int arraySearching(int[] arr,int element){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==element)
              return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr ={1000,100000,1000000};
        for(int i: arr){
            int[] newArr = new int[i];
            HashSet<Integer> hs = new HashSet<>(i);
            TreeSet<Integer> ts = new TreeSet<>();
            for(int j=0;j<newArr.length;j++){
                newArr[j] = (j+5);
                hs.add(j+5);
                ts.add(j+5);
            }
            int target = i-88;
            double start, end;
            start = System.nanoTime();
            int a = arraySearching(newArr,target);
            end = System.nanoTime();
            System.out.println("Time Taken by Array: " +(end-start)/1000 + "ms");

            start = System.nanoTime();
           boolean ans = hs.contains(target);
            end = System.nanoTime();
            System.out.println("Time Taken by HashSet: " +(end-start)/1000 + "ms");

            start = System.nanoTime();
            boolean res = ts.contains(target);
            end = System.nanoTime();
            System.out.println("Time Taken by TreeSet: " +(end-start)/1000 + "ms");
        }
    }
}
