package com.telran.prof.lesson_28.cyclicexample;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Funicular());
        String[] names = {"Roman", "Alena", "Anna", "Kira", "Leo", "Bob", "Jack", "Inna"};

        for (String name : names) {
            new Thread(new Peson(name, cyclicBarrier)).start();
            Thread.sleep(700);
        }
    }
}
