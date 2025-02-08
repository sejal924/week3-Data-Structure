package org.example.large_file_reading;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class File_And_InputStream_Reader {
    public static void fileReader(String filePath){
         try(FileReader fr = new FileReader(filePath)){
             int i;
             while((i = fr.read()) ==-1){
                 //System.out.print((char)i);
                 break;
             }
         }catch(IOException e){
             e.printStackTrace();
         }
    }
    public static void inputStreamReader(String filePath){
           try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"UTF-8")){
               int i;
               while((i= isr.read()) == -1){
                   //System.out.print((char)i);
                   break;
               }
           }
           catch(IOException e){
               e.printStackTrace();
           }
    }
     public static void main(String[] args){
          String filePath = "src\\main\\java\\org\\example\\large_file_reading\\Sample1.txt";
          double start,end;
          start = System.nanoTime();
          fileReader(filePath);
          end = System.nanoTime();
          System.out.println("Time Taken by FileReader: "+ (end-start)/1000+ "ms");

          start = System.nanoTime();
          inputStreamReader(filePath);
          end = System.nanoTime();
          System.out.println("Time Taken by InputStreamReader: "+ (end-start)/1000+ "ms");

         String filePath1 = "src\\main\\java\\org\\example\\large_file_reading\\Sample2.txt";
         start = System.nanoTime();
         fileReader(filePath1);
         end = System.nanoTime();
         System.out.println("Time Taken by FileReader: "+ (end-start)/1000+ "ms");

         start = System.nanoTime();
         inputStreamReader(filePath1);
         end = System.nanoTime();
         System.out.println("Time Taken by InputStreamReader: "+ (end-start)/1000+ "ms");

     }
}
