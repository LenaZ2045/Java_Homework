package com.telran.prof.lesson_25.counter_atomic_thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ExampleFour {

    public static int counter = 0;

    public static AtomicInteger counterTwo = new AtomicInteger();

    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        counterTwo.set(0);
        Thread one = new Thread(new TestCounter());
        Thread two = new Thread(new TestCounter());
        Thread three = new Thread(new TestCounter());

        one.start();
        two.start();
        three.start();

        one.join();
        two.join();
        three.join();
        System.out.println("Counter = " + counter); // we get problem with counting the correct sum for all three counters for collections same problem too
        System.out.println("List size = " + list.size());
//        counterTwo.get(); // atomic method of linked class
        System.out.println("Counter two = " + counterTwo);
    }
}