package com.telran.prof.homework_11_March_18_24.customQueue;

import java.util.Iterator;

public class QueueCustomIterator implements Iterator<Integer> {

    private MyOwnDeque arrayInteger;

    private int currentPosition;

    public QueueCustomIterator(MyOwnDeque arrayInteger) {
        this.arrayInteger = arrayInteger;
    }

    public boolean hasNext() {
        if (currentPosition > 22) { // it is false if empty and array does not contain next element
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Integer next() {
        return currentPosition++;
    }

    public MyOwnDeque iterator() {
        return arrayInteger;
    }
}