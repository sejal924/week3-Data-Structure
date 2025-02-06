package org.example.inputstreamreader.byte_to_character_stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteStream_To_CharacterStream {
    public static void main(String[] args) {
        String
                filePath="src/main/java/org/example/inputstreamreader/byte_to_character_stream/DemoFile2.txt";
        try (FileInputStream fi=new FileInputStream(filePath);
             InputStreamReader is=new InputStreamReader(fi);
             BufferedReader br=new BufferedReader(is);)
        {
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
