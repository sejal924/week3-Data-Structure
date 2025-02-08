package org.example.string_concatenate;

public class String_Concatenate {
    public static void string(String[] string){
        String str = " ";
        for(int i=0;i<string.length;i++){
            str  += string[i];
        }
    }
    public static void stringBuilder(String[] string){
         StringBuilder sb = new StringBuilder();
         sb.append(string);
    }
    public static void stringBuffer(String[] string){
        StringBuffer sb = new StringBuffer();
        sb.append(string);
    }
    public static void main(String[] args){
        int[] str = {1000,10000,1000000};
        for(int s: str){
            String[] newStr = new String[s];
            for(int i=0; i<newStr.length;i++){
                newStr[i] = "Hello,World";
            }
            double start,end;
            start = System.nanoTime();
            if(s != 1000000)
            string(newStr);
            end = System.nanoTime();
            System.out.println("Time Taken by string: " +(end-start)/1000 +"ms");

            for(int i=0; i<newStr.length;i++){
                newStr[i] = "Hello ";
            }
            start = System.nanoTime();
            stringBuilder(newStr);
            end = System.nanoTime();
            System.out.println("Time Taken by stringBuilder: " +(end-start)/1000 +"ms");

            for(int i=0; i<newStr.length;i++){
                newStr[i] = " World";
            }
            start = System.nanoTime();
            stringBuffer(newStr);
            end = System.nanoTime();
            System.out.println("Time Taken by stringBuffer: " +(end-start)/1000 +"ms");
        }
    }
}
