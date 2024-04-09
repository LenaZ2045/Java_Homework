package com.telran.prof.lesson_3.example_abstract;

public class Horse extends WildAnimal {

    public Horse(String name) {
        super(name);
    }

    public void jump() {
        //
    }

    @Override
    public void born() {
        System.out.println("We see a new baby horse");
    }
}