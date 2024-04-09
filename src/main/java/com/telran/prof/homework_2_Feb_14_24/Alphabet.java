package com.telran.prof.homework_2_Feb_14_24;

public abstract class Alphabet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printAlphabet(String name) {
        System.out.println("The name of the alphabet is " + name);
    }
}