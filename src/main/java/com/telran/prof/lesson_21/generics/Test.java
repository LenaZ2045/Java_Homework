package com.telran.prof.lesson_21.generics;

public class Test<T> {

    private T obj;

    public Test(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
