package com.telran.prof.lesson_25.threadstate;

public class ExampleThree {

    public static void main(String[] args) throws InterruptedException {
        Runnable one = () -> {
            while (true) {
                //
            }
        };

        Runnable two = () -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread threadOne = new Thread(one);
        Thread threadTwo = new Thread(two);

        System.out.println("Status one is " + threadOne.getState());
        System.out.println("Status two is " + threadTwo.getState());

        threadOne.start();
        threadTwo.start();

        System.out.println("Status one is " + threadOne.getState());
        System.out.println("Status two is " + threadTwo.getState());

        Thread.sleep(9000); // got status TIME-WAITING, but with 10000-12000 sleep, status was TERMINATED

        System.out.println("Status one is " + threadOne.getState());
        System.out.println("Status two is " + threadTwo.getState());

    }
}
