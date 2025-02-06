package org.example.filereaderproblems.count_the_occurrence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CountOccurrence {
    public static void main(String[] args) {
        String
                filePath="src/main/java/org/example/filereaderproblems/count_the_occurrence/DemoFile1.txt";
        try (BufferedReader br=new BufferedReader(new FileReader(filePath))) {
            String line;
            int count=0;
            String str="the";
            while((line=br.readLine())!=null){
                String[] words=line.split("\\s+");
                for(int i=0;i<words.length;i++){
                    if(words[i].equals(str))
                        count++;
                }
            }
            System.out.println("count of \"" + str + "\" is " + count);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
