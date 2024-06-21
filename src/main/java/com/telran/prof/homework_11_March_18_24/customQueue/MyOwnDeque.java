package com.telran.prof.homework_11_March_18_24.customQueue;

import java.util.Iterator;

public interface MyOwnDeque {

    Integer next();

    Integer next(int element);

    void addToHead(Integer element);

    void addToTail(Integer element);

    Integer pollHead();

    Integer pollTail();

    Integer peekHead();

    Integer peekTail();

    boolean isEmpty();

    Integer nextElement(Iterator<Integer> iterator);

    Integer[] iterator();

    boolean hasNext();
}