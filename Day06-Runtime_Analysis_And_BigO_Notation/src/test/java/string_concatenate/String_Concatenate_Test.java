package string_concatenate;

import org.example.string_concatenate.String_Concatenate;
import org.junit.jupiter.api.Test;

public class String_Concatenate_Test {
    @Test
    void Test(){
        int[] str = {1000,10000,1000000};
        for(int s: str){
            String[] newStr = new String[s];
            for(int i=0; i<newStr.length;i++){
                newStr[i] = "Hello,World";
            }
            double start,end;
            start = System.nanoTime();
            if(s != 1000000)
                String_Concatenate.string(newStr);
            end = System.nanoTime();
            System.out.println("Time Taken by string: " +(end-start)/1000 +"ms");

            for(int i=0; i<newStr.length;i++){
                newStr[i] = "Hello ";
            }
            start = System.nanoTime();
              String_Concatenate.stringBuilder(newStr);
            end = System.nanoTime();
            System.out.println("Time Taken by stringBuilder: " +(end-start)/1000 +"ms");

            for(int i=0; i<newStr.length;i++){
                newStr[i] = " World";
            }
            start = System.nanoTime();
              String_Concatenate.stringBuffer(newStr);
            end = System.nanoTime();
            System.out.println("Time Taken by stringBuffer: " +(end-start)/1000 +"ms");
        }

    }
}
