package org.example.linearsearch.search_specific_word;

public class SearchSpecificWord {
    public static String searchingForWord(String[] sentence,String word){
        for(int i =0;i<sentence.length;i++){
           if(sentence[i].contains(word)){
               return sentence[i];
           }
        }
        return "Not Found";
    }
    public static void main(String [] args){
        String[] sentence = {"Welcome to the world","Hello world","Today's date is 4 feb"};
        String word = "world";
        String result = searchingForWord(sentence,word);
        System.out.println(result);
    }
}
