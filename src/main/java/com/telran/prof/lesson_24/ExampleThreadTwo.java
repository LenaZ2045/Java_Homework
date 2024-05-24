package com.telran.prof.lesson_24;

public class ExampleThreadTwo implements Runnable{
    @Override
    public void run() {
        System.out.println("Sub thread " + Thread.currentThread().getName());
    }
}
