package com.telran.prof.homework_2_Feb_14_24;

import java.util.Arrays;

public class Alphabet7 extends Alphabet {
    private String name = "Alphabet7";
    int alphabetLength = 7;
    char[] alphabet7 = new char[alphabetLength];

    public Alphabet7() {
    }

    public void printAlphabet() {
        super.printAlphabet(name);
        for (int i = 0; i < alphabetLength; i++) {
            alphabet7[i] = (char) ('a' + i);
        }
        System.out.println("Letters are " + Arrays.toString(alphabet7));
    }

    @Override
    public String toString() {
        return "Alphabet7{" +
                "name='" + name + '\'' +
                ", alphabetLength=" + alphabetLength +
                ", alphabet7=" + Arrays.toString(alphabet7) +
                '}';
    }
}