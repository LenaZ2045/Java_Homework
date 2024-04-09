package com.telran.prof.lesson_11.customeDeque;

public interface MyDeque {

    void addToHead(Integer element);
    void addToTail(Integer element);

    Integer pollHead();
    Integer pollTail();

    Integer peekHead();
    Integer peekTail();
    boolean isEmpty();
}