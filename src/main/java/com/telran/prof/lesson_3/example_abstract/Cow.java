package com.telran.prof.lesson_3.example_abstract;

public class Cow extends HomeAnimal {

    public Cow(String name) {
        super(name);
    }

    public void produceMilk() {
        //
    }

    @Override
    public void born() {

        System.out.println("New baby cow arrived!!!");
    }

    @Override
    void humanCare() {
        System.out.println("Human take care for cows");
    }
}