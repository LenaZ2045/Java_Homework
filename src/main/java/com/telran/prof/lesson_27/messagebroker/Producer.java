package com.telran.prof.lesson_27.messagebroker;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    private final BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for ( int i = 0; i < 50; i ++) {
            Message message = new Message(" " + i);
            try {
                Thread.sleep(i * 100);
                queue.put(message);
                System.out.println("Produced " + message.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}