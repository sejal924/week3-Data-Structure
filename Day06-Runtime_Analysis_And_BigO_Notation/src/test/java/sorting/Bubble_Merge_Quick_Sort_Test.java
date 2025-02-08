package sorting;

import org.example.sorting.Bubble_Merge_Quick_Sort;
import org.junit.jupiter.api.Test;

public class Bubble_Merge_Quick_Sort_Test {


    @Test
    void Test(){
        int[] arr = {1000,10000,1000000};
        for(int i: arr){
            int[] newArr = new int[i];
            for(int j = 0;j<newArr.length;j++){
                newArr[j]= (int)(Math.random()*100000);
            }

            double start,end;
            start = System.nanoTime();
            if(i!=1000000)
                Bubble_Merge_Quick_Sort.bubbleSort(newArr);
            end = System.nanoTime();

            System.out.println();
            System.out.println("Time Taken by bubble sort: " +(end-start)/1000 +"ms");

            for(int j = 0;j<newArr.length;j++){
                newArr[j]= (int)(Math.random()*100000);
            }

            start = System.nanoTime();
            Bubble_Merge_Quick_Sort.mergeSort(newArr,0,newArr.length-1);
            end = System.nanoTime();

            System.out.println();
            System.out.println("Time Taken by merge sort: " +(end-start)/1000 +"ms");

            start = System.nanoTime();
            Bubble_Merge_Quick_Sort.quickSort(newArr,0,newArr.length-1);
            end = System.nanoTime();

            System.out.println();
            System.out.println("Time Taken by quick sort: " +(end-start)/1000 +"ms");
        }
    }
}
