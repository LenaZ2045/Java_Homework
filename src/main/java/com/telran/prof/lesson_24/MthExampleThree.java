package com.telran.prof.lesson_24;

public class MthExampleThree {

    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("Main thread " + name);
        Thread one = new Thread() {
            @Override
            public void run() {
                System.out.println("Sub thread " + Thread.currentThread().getName());
            }
        };
        one.start();

        Runnable two = () -> System.out.println("Sub thread " + Thread.currentThread().getName());
        new Thread(two).start();
    }
}