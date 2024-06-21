package com.telran.prof.homework_11_March_18_24.customQueue;

import java.util.*;

public class QueueApp {

    public static void main(String[] args) {
        MyOwnDeque myDeque = new CustomArrayMyDeque(22);
        Deque javaQueue = new ArrayDeque();
        Random random = new Random();

        for (int i = 0; i < 22; i++) {
            if (i < 10) myDeque.addToHead(random.nextInt(1, 50));
            if (i > 10) myDeque.addToTail(random.nextInt(50, 100));
        }
        System.out.println("CUSTOM ARRAY DEQUE");
        System.out.println(myDeque);

        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println(i + " = " + myDeque.pollTail());
        }

        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.println(i + " = " + myDeque.pollHead());
        }

        System.out.println(myDeque);

        System.out.println();
        System.out.println("Iterated through ny custom queue");
        QueueCustomIterator myDequeIterator = new QueueCustomIterator(myDeque);
        int capacity = 0;
        while (myDequeIterator.hasNext() && capacity != 22) {
            int element = myDeque.nextElement(myDequeIterator);
                System.out.print(element + ", "); // " = " + myDeque.next()
            capacity++;
        }

        System.out.println();
        System.out.println("JAVA ARRAY DEQUE");
        for (int j = 0; j < 22; j++) {
            if (j < 10) javaQueue.addFirst(random.nextInt(1, 50));
            if (j > 10) javaQueue.addLast(random.nextInt(50, 100));
        }
        System.out.println(javaQueue);

        System.out.println();
        for (int j = 0; j < 4; j++) {
            System.out.println(j + " = " + javaQueue.pollLast());
        }

        System.out.println();
        for (int j = 0; j < 2; j++) {
            System.out.println(j + " = " + javaQueue.pollFirst());
        }

        System.out.println();
        System.out.println("Iterated over java queue");
        Iterator javaQueueIterator = javaQueue.iterator();
        while (javaQueueIterator.hasNext()) {
            System.out.print(javaQueueIterator.next() + ", ");
        }
    }
}