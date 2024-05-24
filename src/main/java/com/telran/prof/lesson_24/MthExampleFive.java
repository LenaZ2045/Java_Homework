package com.telran.prof.lesson_24;

public class MthExampleFive {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start method Main in thread " + Thread.currentThread().getName());
        Runnable runnable = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("Start Sub thread " + name);
            for (int i = 0; i < 10; i++) {
                System.out.println("Run in sub thread " + name + " " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("End Sub thread " + name);
        };
        new Thread(runnable).start();

        Thread.sleep(4000);

        System.out.println("End method Main in thread " + Thread.currentThread().getName());
    }
}
