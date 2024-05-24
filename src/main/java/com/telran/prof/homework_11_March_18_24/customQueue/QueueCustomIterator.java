package com.telran.prof.homework_11_March_18_24.customQueue;

import java.util.Iterator;

public class QueueCustomIterator implements Iterator<Integer>, QueueCustomIterator2 {

    private MyOwnDeque arrayInteger;

    private int currentPosition;

    public QueueCustomIterator(MyOwnDeque arrayInteger) {
        this.arrayInteger = arrayInteger;
        this.currentPosition = 22;
    }

    public boolean hasNext() {
        if (arrayInteger.next() < currentPosition) { // it is false if empty and array does not contain next element
            return false;
        }
            return true;
    }

    @Override
    public Integer next(int element) {
        if (arrayInteger.next() != 0 && arrayInteger.next() != 22) {
            return element;
        } else {
            return 1;
        }
    }
    @Override
    public Integer next() {
        return arrayInteger.next();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public MyOwnDeque iterator() {
        return arrayInteger;
    }
}