package com.telran.prof.lesson_3.example_interface;

public class Cat implements AbleToEat {
    @Override
    public void eat() {
        System.out.println("Cats like fish-food to eat");
    }
}