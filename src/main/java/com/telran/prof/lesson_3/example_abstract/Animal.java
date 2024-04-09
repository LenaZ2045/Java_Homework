package com.telran.prof.lesson_3.example_abstract;

public abstract class Animal { // by extends we joined all three classes (dog, cow, horse)

    private String name; // saves condition of each objects in abstract class for each object separately

    // presence of fields
    public Animal(String name) {
        this.name = name;
    }

    public void eat() { // methods are the actions which can be done by the object that calls the method
        System.out.println("These animals eat grass!");
    }

    public String getName() {
        return name;
    }

    public abstract void born();

    // object of abstract class is not possible to create
}