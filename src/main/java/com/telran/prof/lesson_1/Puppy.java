package com.telran.prof.lesson_1;

public class Puppy {

    // lowerCamelCase
    String name;
    int age;

    public Puppy() {
        // method is a constructor without parameters
        System.out.println("Hello call from constructor of Puppy class");
    }
    public Puppy(String namePuppy) { // secong construcotr which has name parameter
        name = namePuppy;
    }
}