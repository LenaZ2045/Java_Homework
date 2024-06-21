package com.telran.prof.lesson_25.interruptedthread;

public class ExampleTwo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started");

        Thread thread = new Thread(new TestThread());
        thread.start();

        Thread.sleep(159);
        thread.interrupt(); // Running - isInterrupted; or sleep, wait -
    }
}
