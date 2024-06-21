package com.telran.prof.lesson_27.messagebroker;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    private final BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Message message;
            Thread.sleep(15000);
            while (true) {
                System.out.println("Consumer " + queue.take().getMsg());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}