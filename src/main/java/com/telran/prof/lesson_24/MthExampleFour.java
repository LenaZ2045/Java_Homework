package com.telran.prof.lesson_24;

public class MthExampleFour {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("start method main in thread " + Thread.currentThread().getName());
        // new ThreadFour().run(); // this example shows the order and how main works in this situation

        // thread creation
        new Thread(new ThreadFour()).start();
        System.out.println("End method from Sub thread " + Thread.currentThread().getName());
    }
}