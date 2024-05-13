package com.telran.prof.lesson_21.generics;

public class TestObject { // for example when we create object without parameter type of our data we work with
                            // this each variable will be cast to an object data type

    private Object obj;

    public TestObject(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }
}