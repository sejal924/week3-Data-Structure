package org.example.stringbuffer.comparing_string;

public class Comparing {
    public static void main(String[] args){
        long startTime,endTime;
        StringBuilder sBuilder = new StringBuilder("Hello");
        StringBuffer sBuffer = new StringBuffer("Hello");

         startTime = System.nanoTime();
         for(int i=0 ; i<1000000;i++){
             sBuilder.append("Hello");
         }
         endTime = System.nanoTime();
         System.out.println("Time Taken by String Builder: " + (endTime - startTime) +"ns");

         startTime = System.nanoTime();
        for(int i=0 ; i<1000000;i++){
            sBuffer.append("Hello");
        }
        endTime = System.nanoTime();
        System.out.println("Time Taken by String Buffer: " + (endTime - startTime) +"ns");

    }
}
