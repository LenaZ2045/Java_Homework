package com.telran.prof.lesson_26.correctWITHincorrect;

public class MthExampleIncorrect {

    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner(); // created an object Runnable

        Thread one = new Thread(runner); // each thread executes method RUN() of the same Runnable object
        Thread two = new Thread(runner);
        Thread three = new Thread(runner);

        one.start();
        two.start();
        three.start();

        // join method - makes thread to sleep inside which it is called
        // while the thread in which it is called is not going to be complete with the code work
        one.join();
        two.join();
        three.join();
    }
}
