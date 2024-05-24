package com.telran.prof.homework_11_March_18_24.customQueue;

import java.util.Arrays;
import java.util.Iterator;

public class CustomArrayMyDeque implements MyOwnDeque {

    private int head;
    private int tail;
    private final Integer[] elements;

    public CustomArrayMyDeque(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity must be more than 1");
        }
        this.elements = new Integer[capacity];
        this.head = (capacity - 1) / 2;
        this.tail = head;
    }

    @Override
    public Integer next() {
        if (head != 0) {
            head++;
            return head;
        }
        tail++;
        return tail;
    }

    @Override
    public Integer next(int element) {
        return element;
    }

    @Override
    public void addToHead(Integer element) {
        if (head != tail) {
            elements[head] = element;
        }
        head = head - 1;
        elements[head] = element;
    }

    @Override
    public void addToTail(Integer element) {
        if (tail != head) {
            elements[tail] = element;
        }
        tail++;
        elements[tail] = element;
    }

    @Override
    public Integer pollHead() {
        Integer element = elements[head];
        if (!isEmpty()) {
            head++;
        } else {
            System.out.println("No more elements");
        }
        return element;
    }

    @Override
    public Integer pollTail() {
        Integer element = elements[tail];
        if (tail != 0) {
            tail--;
        } else {
            System.out.println("No more elements");
        }
        return element;
    }

    @Override
    public Integer peekHead() {
        Integer element = elements[head];
        if (element == null) {
            System.out.println("No such element at the Head");
        }
        return element;
    }

    @Override
    public Integer peekTail() {
        Integer element = elements[tail];
        if (element == null) {
            System.out.println("No such element at the Tail");
        }
        return element;
    }

    @Override
    public boolean isEmpty() {
        if (elements != null) {
            return false;
        }
        return true;
    }

    @Override
    public Integer nextElement(Iterator<Integer> iterator) {
        Integer element = elements[iterator.next()];
        return element;
    }

    @Override
    public Integer[] iterator() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = tail - 1; i >= head; i--) {
            sb.append(elements[i]).append(" ");
        }
        return "CustomArrayDeque{" + "head=" + head + ", tail=" + tail + ", elements=" + Arrays.toString(elements) + '}';
    }
}