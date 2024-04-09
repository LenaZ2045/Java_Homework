package com.telran.prof.lesson_3.example_interface;

public class AirPlane implements Flyable {
    @Override
    public void fly() {
        // we must all implemented method release in everywhere where we add implements
        System.out.println("Airplane flies!");
    }
}