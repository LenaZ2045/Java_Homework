package com.telran.prof.homework_2_Feb_14_24;

import java.util.Arrays;

public class Alphabet22 extends Alphabet {
    private String name = "Alphabet22";
    int alphabetLength = 22;
    char[] alphabet22 = new char[alphabetLength];

    public Alphabet22() {
    }

    public void printAlphabet() {
        super.printAlphabet(name);
        for (int i = 0; i < alphabetLength; i++) {
            alphabet22[i] = (char) ('a' + i);
        }
        System.out.println("Letters are " + Arrays.toString(alphabet22));
    }

    @Override
    public String toString() {
        return "Alphabet33{" +
                "name='" + name + '\'' +
                ", alphabetLength=" + alphabetLength +
                ", alphabet33=" + Arrays.toString(alphabet22) +
                '}';
    }
}