package com.telran.prof.lesson_27.crossbow;

public class CrossBowApp {

    public static void main(String[] args) {
        CrossBow crossBow = new CrossBow();

        new Thread(crossBow::fire).start();
        new Thread(crossBow::reload).start();
    }
}