package org.java.String;

public class ReverseWord {
    public static void main(String[] args) {
        String word = "Dhurandhar";

        ReverseWord.processOfReverse(word);
    }

    public static void processOfReverse(String word){
       String reverseWord = "";
       for(int i = word.length() - 1; i >= 0; i--) {
           reverseWord += word.charAt(i);
       }
        System.out.println("Reverse Word : "+ reverseWord.toLowerCase());
    }
}
