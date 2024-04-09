package com.telran.prof.lesson_7.practice;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyList {

    private String[] elements;
    private int cursor;

    public MyList(String[] elements) {
        this.elements = elements;
    }

    public Iterator<String> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<String> {

        @Override
        public boolean hasNext() {
//            return cursor != elements.length;
            return cursor < elements.length;

        }

        @Override
        public String next() {
            int i = cursor;
//            if (i >= elements.length){
//                throw new ConcurrentModificationException();
//            } else if (i <= elements.length) {
                cursor = i + 2;
                return elements[i];
            }
//            throw new NoSuchElementException();
    }
}