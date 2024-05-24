package com.telran.prof.lesson_24;

public class MthExampleTwo {

    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("Main thread " + name);

        ExampleThreadTwo exampleThreadTwo = new ExampleThreadTwo(); // because implements Runnable
        Thread thread = new Thread(exampleThreadTwo); // need to call parent Thread
        thread.start();
    }
}
