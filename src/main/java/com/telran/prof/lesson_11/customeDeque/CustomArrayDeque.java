package com.telran.prof.lesson_11.customeDeque;

import java.util.Arrays;

public class CustomArrayDeque implements MyDeque{

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
        head = head - 1;
        elements[head] = element;

    }

    @Override
    public void addToTail(Integer element) {
        elements[tail] = element;

    }

    @Override
    public Integer pollHead() {
        Integer element = elements[head];
        head++;
        return element;
    }

    @Override
    public Integer pollTail() {
        tail--;
        Integer element = elements[tail];
        return element;
    }

    @Override
    public Integer peekHead() {
      return null;
    }

    @Override
    public Integer peekTail() {
      return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for ( int i = tail - 1; i >= head; i--) {
            sb.append(elements[i]).append(" ");
        }
        return "CustomArrayDeque{" +
                "head=" + head +
                ", tail=" + tail +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}