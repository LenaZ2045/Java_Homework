package com.telran.prof.homework_2_Feb_14_24;

import java.util.Arrays;
import java.util.List;

public class MainAlphabetApp {
    public static void main(String[] args) {
        Alphabet22 alphabet33 = new Alphabet22();
        Alphabet17 alphabet17 = new Alphabet17();
        Alphabet7 alphabet7 = new Alphabet7();

        alphabet33.printAlphabet();
        alphabet17.printAlphabet();
        alphabet7.printAlphabet();

        printAllInfo(alphabet7, alphabet17, alphabet33);
    }

    public static void printAllInfo(Alphabet alphabet7, Alphabet alphabet17, Alphabet alphabet33) {
        List<Alphabet> classes = Arrays.asList(alphabet7, alphabet17, alphabet33);
        for (Alphabet array : classes) {
            printAlphabet(String.valueOf(array));
        }
    }
    public static void printAlphabet(String name) {
        System.out.println("The name of the alphabet is " + name.toString());
    }
}
