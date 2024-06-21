package com.telran.prof.lesson_28.countdown;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class PersonInAirport implements Runnable{

    private final String name;

    private CountDownLatch countDownLatch;

    public PersonInAirport(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
        System.out.println("-> " + name + " arrived at the airport");
        System.out.println("[!] " + name + " passed control");
        System.out.println("[!] " + name + " is at the lunch");
        // informed that it is ready and decreased counter by one
        countDownLatch.countDown(); // decreases by 1
        System.out.println();
        // counter is waiting until counter does not reach zero
            countDownLatch.await();
//            countDownLatch.await(25, TimeUnit.SECONDS);

            // will execute the code after when counter will be equal tp zero
            System.out.println("[!] " + name + " is seated at his spot");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
