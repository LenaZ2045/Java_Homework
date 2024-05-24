package com.telran.prof.lesson_24.hippodrome;

import java.util.Comparator;

public class Horse implements Runnable, Comparator<Horse> {

    private String name;
    private int step;

    private int loopLength;

    private int currentPosition = 0;

    public Horse(String name, int step, int loopLength) {
        this.name = name;
        this.step = step + 1;
        this.loopLength = loopLength;
    }

    @Override
    public void run() {
        long time = System.currentTimeMillis();
        while (currentPosition < loopLength) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currentPosition += step;
//            System.out.println("Horse " + name + " step by " + currentPosition);
        }
        System.out.println("HORSE : " + name + ", finished 1000 meters race length at TIME = " + (System.currentTimeMillis() - time));
    }

    @Override
    public int compare(Horse o1, Horse o2) {
        return 0; // o1.getTime() - o2.getTime();
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name=" + name +
                ", step=" + step +
                ", loopLength=" + loopLength +
                ", currentPosition=" + currentPosition +
                '}';
    }
}