package com.telran.prof.lesson_26.correctWITHincorrect;

public class CustomSync implements Runnable{

    private Object monitor;

    public CustomSync(Object monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        System.out.println("I am " + Thread.currentThread().getName() + " start run method");
        synchronized (monitor) {
            System.out.println("I am " + Thread.currentThread().getName() + " catch mutex");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("I am " + Thread.currentThread().getName() + " released mutex");
        }
    }
}
