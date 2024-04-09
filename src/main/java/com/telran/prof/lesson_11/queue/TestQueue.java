package com.telran.prof.lesson_11.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {

    public static void main(String[] args) {
        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(5);
        integerQueue.add(2);
        integerQueue.add(1);
        System.out.println(integerQueue);

        System.out.println(integerQueue.peek()); //
        System.out.println(integerQueue);

        System.out.println(integerQueue.poll()); // extracted
        System.out.println(integerQueue);
    }
}
