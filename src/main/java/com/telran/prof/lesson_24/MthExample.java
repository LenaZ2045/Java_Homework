package com.telran.prof.lesson_24;

public class MthExample {

    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("Main thread " + name);

        ExampleThreadOne threadOne = new ExampleThreadOne(); // when extended from Thread, NO NEED to call class Thread
//        threadOne.run();
        threadOne.start();

        // 1 - to create a thread we need to extend from Thread parent class
        // 2 - Second we need to override the method RUN
        // 2a - evaluate the method RUN new logic by our task
        // 3 - create new object of off class name
        // 4 - call our thread to begin executing

        for (int i = 0; i < 10; i++) {
            new ExampleThreadOne().start(); // will create 10 similar threads
        }
    }
}
