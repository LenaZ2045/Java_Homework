package com.telran.prof.lesson_3.example_abstract;

public abstract class HomeAnimal extends Animal {

    public HomeAnimal(String name) {
        super(name); // super() calls for parent constructor
        // this() - calls for current constructor
    }

    abstract void humanCare();
}