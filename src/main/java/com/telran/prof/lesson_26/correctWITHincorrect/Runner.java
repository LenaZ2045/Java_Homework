package com.telran.prof.lesson_26.correctWITHincorrect;

import static com.telran.prof.lesson_26.correctWITHincorrect.MthExampleIncorrect.counter;

public class Runner implements Runnable{
    @Override
    // public synchronized void run() { // we may input "synchronized"
    // in the method signature for the purpose for indexes so that indexes are not getting doubled or repeated

    public synchronized void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 1000; i++) {
            // 1) getting variable
            // 2) increasing variable
            // 3) setting variable

            synchronized (this) { // can surround the block of the code with synchronized
                counter++;
                System.out.println("Thread " + name + " " + counter);
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Counter = " + counter);
    }
}