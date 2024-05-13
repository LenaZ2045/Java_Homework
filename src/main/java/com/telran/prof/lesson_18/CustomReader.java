package com.telran.prof.lesson_18;

public class CustomReader implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Hello from close from Custom reader");
    }
}