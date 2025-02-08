package org.example.fibonacci_computation;
import java.util.*;

public class Fibonacci_Computation{
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
    public static void main(String[] args){
         int[] arr = {10,30,50};
         for(int i=0;i<3;i++){
             int j = arr[i];
             double start , end;
             start = System.nanoTime();
             fibonacciRecursive(j);
             end = System.nanoTime();
             System.out.println("Time Taken by recursive method: " +(end-start)/1000 +"ms");
             start = System.nanoTime();
             fibonacciIterative(j);
             end = System.nanoTime();
             System.out.println("Time Taken by iterative method: " +(end-start)/1000 +"ms");
         }
    }
}

