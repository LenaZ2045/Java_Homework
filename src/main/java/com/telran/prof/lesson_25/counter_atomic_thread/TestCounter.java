package com.telran.prof.lesson_25.counter_atomic_thread;

public class TestCounter implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            ExampleFour.counter++; // 1) get counter, 2) counter + 1, 3) summarize total
            ExampleFour.counterTwo.getAndIncrement();
            System.out.println("Thread " + Thread.currentThread().getName() + " " + ExampleFour.counter);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ExampleFour.list.add(i); // adds last index and calculates it
        }
    }
}