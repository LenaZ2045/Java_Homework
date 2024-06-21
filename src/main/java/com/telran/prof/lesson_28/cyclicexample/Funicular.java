package com.telran.prof.lesson_28.cyclicexample;

public class Funicular implements Runnable{
    @Override
    public void run() {
        try {
//            Thread.sleep(10000);
            System.out.println("Funicular took few people and is going to the top of the mountain");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
