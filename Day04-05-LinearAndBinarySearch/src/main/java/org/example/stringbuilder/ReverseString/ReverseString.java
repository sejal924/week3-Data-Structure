package org.example.stringbuilder.ReverseString;
import java.util.*;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        //taking the string input from user
        System.out.print("Enter the string: ");
        String string = sc.next();

        //creating object of StringBuilder
        StringBuilder sb = new StringBuilder();
        //adding string into sb(object)
        sb.append(string);

        //reversing string(Object)
        sb.reverse();

        //converting into string
        sb.toString();
        System.out.println("Reverse string is: " +sb);

       sc.close();
    }
}
