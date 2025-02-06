package org.example.stringbuilder.remove_duplicates;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          //taking the string input from user
          System.out.print("Enter the string: ");
          String string = sc.next();

          //creating StringBuilder object
          StringBuilder sb = new StringBuilder();
          //creating hashset of Character type
          HashSet<Character> hs = new HashSet<>();

          for(int i=0;i<string.length();i++){
              char c = string.charAt(i);
              if(!hs.contains(c)){
                  hs.add(c);
                  sb.append(c);
              }
          }
          sb.toString();
          System.out.println("After removing the duplicates: " + sb);
    }
}
