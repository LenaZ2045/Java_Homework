package com.telran.prof.lesson_14;

public interface CustomFunctionalInt {

    void accept();

    default void print() {
        System.out.println("Hello");
    }

    static void printTwo() {
        System.out.println("HelloTwo");
    }
}