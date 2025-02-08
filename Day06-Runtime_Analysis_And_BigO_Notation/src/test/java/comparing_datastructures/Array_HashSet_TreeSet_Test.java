package comparing_datastructures;

import org.example.comparing_datastructures.Array_HashSet_TreeSet;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.TreeSet;

public class Array_HashSet_TreeSet_Test {
    @Test
    void test(){
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
            int a = Array_HashSet_TreeSet.arraySearching(newArr,target);
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
