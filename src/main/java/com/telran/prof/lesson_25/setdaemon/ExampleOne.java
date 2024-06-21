package com.telran.prof.lesson_25.setdaemon;

public class ExampleOne {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start main thread");
        Thread thread = new Thread(new Printer());
        thread.setDaemon(true); // works like when main thread method is getting done the child thread also stops working
        thread.start();

        // thread.stop(); // no means to use this method as we are not informed what our threads are doing at the current moment
        // not recommended to use method stop

        Thread.sleep(5000);
        System.out.println("End main thread");
    }
}