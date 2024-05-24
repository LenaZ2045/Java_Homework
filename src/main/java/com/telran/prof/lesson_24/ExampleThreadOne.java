package com.telran.prof.lesson_24;

public class ExampleThreadOne extends Thread{

    @Override
    public void run() {
        System.out.println("Sub thread " + Thread.currentThread().getName());
    }
}
