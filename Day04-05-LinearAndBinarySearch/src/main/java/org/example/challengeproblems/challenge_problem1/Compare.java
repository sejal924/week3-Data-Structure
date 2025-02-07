package org.example.challengeproblems.challenge_problem1;
import java.io.*;
public class Compare {
    public static void main(String[] args) {
        long startTime, endTime;
// Testing StringBuilder Performance
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("Java");
        for (int i = 0; i < 1000000; i++) {
            sb.append(" Performance Test");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) +
                " ns");
// Testing StringBuffer Performance
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer("Java");
        for (int i = 0; i < 1000000; i++) {
            sbf.append(" Performance Test");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time : " + (endTime - startTime) +
                " ns");
        String
                filePath="src/main/java/org/example/challengeproblems/challenge_problem1/DemoFile5.txt";
        try (FileWriter writer=new FileWriter(filePath)){
            writer.write(sb.toString());
            writer.write(sbf.toString());
        }catch(IOException e){
            e.printStackTrace();
        }
        try (BufferedReader br=new BufferedReader(new FileReader(filePath)))
        {
            startTime = System.nanoTime();
            String line;
            int count=0;
            while((line=br.readLine())!=null){
                count++;
            }
            endTime = System.nanoTime();
            System.out.println("FileReader Time : " + (endTime -
                    startTime) + " ns");
        }catch(IOException e){
            e.printStackTrace();
        }
        try (InputStreamReader is=new InputStreamReader(new
                FileInputStream(filePath));
             BufferedReader br=new BufferedReader(is)) {
            startTime = System.nanoTime();
            String line;
            int count=0;
            while((line= br.readLine())!=null){
                count++;
            }
            endTime = System.nanoTime();
            System.out.println("InputStreamReader Time: " + (endTime -
                    startTime) + " ns");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
