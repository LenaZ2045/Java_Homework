package com.telran.prof.lesson_26.correctWITHincorrect;

public class TestSync {

    public static void main(String[] args) throws InterruptedException {
        SyncImpl sync = new SyncImpl();

        Thread threadOne = new Thread(sync);
        Thread threadTwo = new Thread(sync);

        threadOne.start();
        Thread.sleep(1000); // main method sleeps 1 sec

        threadTwo.start();

        Thread.sleep(2000); // main method sleeps 2 sec

        System.out.println("State for thread one = " + threadOne.getState());
        System.out.println("State for thread two = " + threadTwo.getState());

    }
}
