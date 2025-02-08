package fibonacci_computation;

import org.example.fibonacci_computation.Fibonacci_Computation;
import org.junit.jupiter.api.Test;

public class Fibonacci_Computation_Test {
    @Test
    void Test(){
        int[] arr = {10,30,50};
        for(int i=0;i<3;i++){
            int j = arr[i];
            double start , end;
            start = System.nanoTime();
            Fibonacci_Computation.fibonacciRecursive(j);
            end = System.nanoTime();
            System.out.println("Time Taken by recursive method: " +(end-start)/1000 +"ms");
            start = System.nanoTime();
            Fibonacci_Computation.fibonacciIterative(j);
            end = System.nanoTime();
            System.out.println("Time Taken by iterative method: " +(end-start)/1000 +"ms");
        }
    }
}
