package com.telran.prof.lesson_26;

public class MthExample {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        Runnable runnable = new Runnable() { // created an object Runnable
            @Override
            // public synchronized void run() { // we may input "synchronized" for whole method (like a blocking)
            // in the method signature for the purpose for indexes so that indexes are not getting doubled or repeated

            public synchronized void run() {
                String name = Thread.currentThread().getName();
                for (int i = 0; i < 1000; i++) {
                    // 1) getting variable
                    // 2) increasing variable
                    // 3) setting variable

                    // Mutex resolves if can this code executed? or not? like occupied or vacant (Mutex is a boolean)
                    // Monitor - is a mechanism for a work with Mutex
                    // when thread is reaching the block which is marked with synchronized it checks if the state is vacant
                    // if Mutex is vacant then thread is entering the synchronized block and marks it with occupied
                    // when Mutex of an object is occupied, then thread enters to the waiting state
                    synchronized (this) { // can surround the block of the code with synchronized for a part of code
                        counter++;
                        System.out.println("Thread " + name + " " + counter);
                    }
                    // after first thread completed the synchronized block
                    // Mutex is becoming vacant and next thread can start executing in the synchronized block with the same object
                    synchronized (object) {
                        object.getClass();
                    }
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Counter = " + counter);
            }
        };

        // Runnable || for (1||2||3), synchronized 2-> 1->3 - continued for (2||3||1) threads

        Thread one = new Thread(runnable); // each thread executes method RUN() of the same Runnable object
        Thread two = new Thread(runnable);
        Thread three = new Thread(runnable);

        one.start();
        two.start();
        three.start();

        // join method - makes thread to sleep inside which it is called
        // while the thread in which it is called is not going to be complete with the code work
        one.join();
        two.join();
        three.join();

    }
}
