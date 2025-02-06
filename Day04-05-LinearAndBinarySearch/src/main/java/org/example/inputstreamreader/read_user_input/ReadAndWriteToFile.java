package org.example.inputstreamreader.read_user_input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class ReadAndWriteToFile {
    public static void main(String[] args) {
        String
                filePath="src/main/java/org/example/inputstreamreader/read_user_input/DemoFile3.txt"
                ;
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            FileWriter writer=new FileWriter(filePath);
            String line;
            while(!(line = br.readLine()).equals("exit")){
                writer.write(line + "\n");
                writer.flush();
            }
            System.out.println("Successfully written in the file");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

