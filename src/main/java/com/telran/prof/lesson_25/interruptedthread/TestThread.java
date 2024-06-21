package com.telran.prof.lesson_25.interruptedthread;

public class TestThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Start thread " + Thread.currentThread().getName());

        long j = 0;
//        while (true) // prints true
        while (!Thread.currentThread().isInterrupted()) { // prints false
            for (int i = 0; i < 100000000L; i++) {
                j += i;
            }
            System.out.println("Current status interrupted " + Thread.currentThread().getName() + " = " + Thread.currentThread().isInterrupted());
                    try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted. End thread");
            return;
        }
        }
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            System.out.println("Thread got interrupted");
//            return;
//        }
        System.out.println("End thread " + Thread.currentThread().getName());
    }
}
