package com.telran.prof.lesson_3.example_interface;

public interface Flyable { // interface is a fully an abstract class

    public static final String FLY_NAME = "Name"; // is a final constant/variable (condition is general for all)

    void fly(); // by the default they are public abstract methods
// and only abstract methods, no other methods here

//void prepareToFly() {
//    System.out.println("Prepares before each start");
//}    // will be mistake if written like this

    default void prepareToFly() {
        System.out.println("Prepares before each start");
    }
}