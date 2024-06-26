package com.telran.prof.lesson_3.example_abstract;

public class Dog extends HomeAnimal {

    public Dog(String name) {
        super(name);
    }

    public void hunts() {
        System.out.println("Dog hunts for rabbits");
    }

    @Override
    public void born() {
        System.out.println("New puppy has born!!!");
    }

    @Override
    void humanCare() {
        System.out.println("Human cares for dog");
    }
}