package com.telran.prof.lesson_29;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

public class Building implements Runnable{

    private final String city;

    private final CountDownLatch latch;
    private final String[] strings;

    public Building(String city, CountDownLatch latch, String[] strings) {
        this.city = city;
        this.latch = latch;
        this.strings = strings;
    }

    @Override
    public void run() {
        for (int i = 0; i < strings.length; i++) {
            System.out.println("" + city + " " + strings[i] + ", " + Thread.currentThread().getName() + " " + new Date());
            latch.countDown();
            try {
                Thread.sleep((long) (Math.random()*1500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
