package com.telran.prof.lesson_28.cyclicexample;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Peson implements Runnable{

    private final String name;

    private final CyclicBarrier cyclicBarrier;

    public Peson(String name, CyclicBarrier cyclicBarrier) {
        this.name = name;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println("-> " + name + " is waiting on the platform");
        try {
            cyclicBarrier.await();
            System.out.println("<- " + name + " is at the top");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
