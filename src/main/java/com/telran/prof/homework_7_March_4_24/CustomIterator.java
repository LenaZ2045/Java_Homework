package com.telran.prof.homework_7_March_4_24;

import java.util.Iterator;

public class CustomIterator implements Iterator<Integer> {

    private int[] integers;
    private int currentPosition;

    public CustomIterator(int[] integers) {
        this.integers = integers;
        this.currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        if (currentPosition > integers.length) {
            return false;
        }
        if (currentPosition < integers.length) {
            System.out.println("Array has numbers");
            System.out.println();
            return true;
        }
        System.out.println("Array does not have any numbers");
        return false;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            int nextValue = integers[currentPosition];
            currentPosition++;
            return nextValue;
        }
        if (integers.length == 0) {
            return currentPosition;
        }
        return next();
    }
}