package com.telran.prof.lesson_3;

public abstract class Animal { // we by extends joined all three classes (dog, cow, horse)
    public void eat() {
        System.out.println("This animal eats grass!");
    }

    public abstract void born();

    // object of abstract class is not possible to create
}