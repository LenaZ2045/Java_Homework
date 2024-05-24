package com.telran.prof.lesson_24;

public class ThreadFour implements Runnable{
    @Override
    public void run() {
        System.out.println("Start method from Sub thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End method from Sub thread " + Thread.currentThread().getName());
    }
}