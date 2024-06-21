package com.telran.prof.lesson_26.correctWITHincorrect;

public class CustomSyncApp {

    public static void main(String[] args) {
        Object monitor = new Object();
        Object o = new Object();

        CustomSync customSyncOne = new CustomSync(monitor);
        CustomSync customSyncTwo = new CustomSync(monitor);
        CustomSync customSyncThree = new CustomSync(o);

        Thread threadOne = new Thread(customSyncOne);
        Thread threadTwo = new Thread(customSyncTwo);
        Thread threadThree = new Thread(customSyncThree);

        threadOne.start();
        threadTwo.start();

    }
}