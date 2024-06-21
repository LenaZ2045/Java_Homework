package com.telran.prof.lesson_25.setdaemon;

public class Printer implements Runnable{
    @Override
    public void run() {
        int i = 0;
//        for (int i = 0; i < 100; i++) {
            while (true) {
            System.out.println(" " + Thread.currentThread().getName() + " " + i);
            i++;
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}