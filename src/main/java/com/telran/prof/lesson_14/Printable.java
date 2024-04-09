package com.telran.prof.lesson_14;

@FunctionalInterface // can not add other abstract interface
public interface Printable {

    void print(String text); // one abstract method functional interface

//    String getHello(); // no other abstract method

    default void printHello() { // van have default method
        System.out.println("printHello");
    }

    static void printHelloTwo() { // can have static method
        System.out.println("printHelloTwo");
    }
}