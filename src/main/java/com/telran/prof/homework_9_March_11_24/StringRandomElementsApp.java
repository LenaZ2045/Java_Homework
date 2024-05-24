package com.telran.prof.homework_9_March_11_24;

import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet; // may use TreeSet and have all characters be listed in the ascending order

public class StringRandomElementsApp {

    public static void main(String[] args) {
        String stringLine1 = "1oandjseuaisldifgc ajkdlaid"; // created new string one
        String stringLine2 = "bbdaasioidryi-e1231278 djkl"; // created new string two

        Set<Character> symbolsOfTwoLines = new HashSet<>(); // I could use TreeSet too but for speed I chose HashSet
        for (int i = 0; i < stringLine1.length(); i++) { // run over line 1 in the cycle for
            char ch1 = stringLine1.charAt(i); // input each character into the char 1
            if (!Character.isWhitespace(ch1)) { // check logic if line 1 has any spaces between characters
                symbolsOfTwoLines.add(ch1); // file characters that are unique into HashSet collection interface
            }
        }

        for (int i = 0; i < stringLine2.length(); i++) { // run over line 2 in the cycle for
            char ch2 = stringLine2.charAt(i); // input each character into the char 2
            if (!Character.isWhitespace(ch2)) { // check logic if line 1 has any spaces between characters
                symbolsOfTwoLines.add(ch2); // file characters that are unique into HashSet collection interface
            }
        }

        System.out.println("Unique characters from both strings are : "); // print sentence in the console
        for (char ch : symbolsOfTwoLines) { // run over HashSet collection in forEach character we added
            System.out.print(ch + " "); // print that list with unique characters
        }
    }
}