package com.telran.prof.homework_2_Feb_14_24;

import java.util.Arrays;

public class Alphabet17 extends Alphabet {
    private String name = "Alphabet17";
    int alphabetLength = 17;
    char[] alphabet17 = new char[alphabetLength];

    public Alphabet17() {
    }

    public void printAlphabet() {
        super.printAlphabet(name);
        for (int i = 0; i < alphabetLength; i++) {
            alphabet17[i] = (char) ('a' + i);
        }
        System.out.println("Letters are " + Arrays.toString(alphabet17));
    }

    @Override
    public String toString() {
        return "Alphabet17{" +
                "name='" + name + '\'' +
                ", alphabetLength=" + alphabetLength +
                ", alphabet17=" + Arrays.toString(alphabet17) +
                '}';
    }
}