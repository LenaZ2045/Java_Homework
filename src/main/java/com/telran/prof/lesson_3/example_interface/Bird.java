package com.telran.prof.lesson_3.example_interface;

public class Bird implements Flyable, AbleToEat { // can be placed into arrays
    @Override
    public void fly() {
        System.out.println("Birds can fly!");
    }

    @Override
    public void eat() {

    }
}