package com.telran.prof.homework_2_Feb_14_24;

import java.util.Arrays;

public class Alphabet33 extends Alphabet {
    private String name = "Alphabet33";
    int alphabetLength = 33;
    char[] alphabet33 = new char[alphabetLength];

    public Alphabet33() {
    }

    public void printAlphabet() {
        super.printAlphabet(name);
        for (int i = 0; i < alphabetLength; i++) {
            alphabet33[i] = (char) ('a' + i);
        }
        System.out.println("Letters and Characters in this alphabet are " + Arrays.toString(alphabet33));
    }

    @Override
    public String toString() {
        return "Alphabet33{" +
                "name='" + name + '\'' +
                ", alphabetLength=" + alphabetLength +
                ", alphabet33=" + Arrays.toString(alphabet33) +
                '}';
    }
}