package org.example.stringbuffer.string_concatenate;

 public class Concatenate {
        public static String stringConcatenate(String[] string){
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<string.length;i++){
            String s = string[i];
             sb.append(s);
             sb.append(" ");
        }

        return sb.toString();
    }
    public static void main(String [] args){
        String[] str = {"Welcome", "To", "The", "World" };
        System.out.println("Concatenated string is: " + stringConcatenate(str));
    }
}
