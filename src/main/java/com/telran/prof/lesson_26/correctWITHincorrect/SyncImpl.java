package com.telran.prof.lesson_26.correctWITHincorrect;

public class SyncImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("I am " + Thread.currentThread().getName() + " start run method");
        synchronized (this) {
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
