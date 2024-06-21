package com.telran.prof.lesson_27.crossbow;

public class CrossBow {

    private int arrows = 10;

    public synchronized void fire() {
        while (true) {
            for (int i = arrows; i >= 0; i--) {
                if (i != 0) {
                    System.out.println("The arrow is " + (arrows - i + 1));

                } else {
                    System.out.println("The arrows are over");
                    arrows = 0;
                    System.out.println("Count of arrows " + arrows);
                    notify();
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Got new arrows");
                    i = arrows;
                }
            }
        }
    }

    public synchronized void reload() {
        while (true) {
            System.out.println("New arrows on the way");
            arrows = 10;
            System.out.println("Count of arrows loaded " + arrows);
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
