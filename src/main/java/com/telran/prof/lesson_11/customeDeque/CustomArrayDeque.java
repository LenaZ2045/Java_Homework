package com.telran.prof.lesson_11.customeDeque;

import java.util.Arrays;
import java.util.Iterator;

public class CustomArrayDeque implements MyDeque, Iterable<Integer> {

    private int head;
    private int tail;
    private final Integer[] elements;

    public CustomArrayDeque(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity must be more than 1");
        }
        this.elements = new Integer[capacity];
        this.head = (capacity - 1) / 2;
        this.tail = head;
    }

    @Override
    public void addToHead(Integer element) {
        if (head == 0) {
            elements[head] = element;
        } else {
            head = head - 1;
            elements[head] = element;
        }
    }

    @Override
    public void addToTail(Integer element) {
        if (tail == 0) {
            elements[tail] = element;
        } else {
            tail++;
            elements[tail] = element;
        }
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
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = tail - 1; i >= head; i--) {
            sb.append(elements[i]).append(" ");
        }
        return "CustomArrayDeque{" + "head=" + head + ", tail=" + tail + ", elements=" + Arrays.toString(elements) + '}';
    }

    public Integer iterator(Iterator<Integer> capacity) { // YURIY, I WISH TO SEE HOW WOULD YOU DO THIS, PLEASE SHOW?
        Integer element = elements[capacity.next()];
        if (element.equals(null)) {
            return null;
        }
        return element;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}