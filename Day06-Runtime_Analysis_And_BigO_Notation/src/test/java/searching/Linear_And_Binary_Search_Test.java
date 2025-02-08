package searching;

import org.example.searching.Linear_And_Binary_Search;
import org.junit.jupiter.api.Test;

public class Linear_And_Binary_Search_Test {


     @Test
    void Test(){
         int[] arr = {1000,10000,1000000};
         for(int i=0;i<3;i++){
             int[] newArr = new int[arr[i]];
             for(int j=0;j<newArr.length;j++){
                 newArr[j]=(j+1);
             }
             double start ,end;
             start = System.nanoTime();
             int result = Linear_And_Binary_Search.linearSearch(newArr,30);
             end = System.nanoTime();
             if(result!=-1){
                 System.out.println("Time taken by linear search: " + (end - start)/1000 + "ms");
                 System.out.println("Target found: " + result);
             }
             else{
                 System.out.println("Target not found" );
             }

             start = System.nanoTime();
             int result1 = Linear_And_Binary_Search.binarySearch(newArr,30);
             end = System.nanoTime();

             if(result1!=-1){
                 System.out.println("Time taken by binary search: " + (end - start)/1000 + "ms");
                 System.out.println("Target found: " +result1);
             }
             else{
                 System.out.println("Target not found");
             }
         }
     }
}
