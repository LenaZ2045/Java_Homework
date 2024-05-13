package com.telran.prof.lesson_22;

import java.util.function.Predicate;

public class PredicateT<T> implements Predicate<T> {
    @Override
    public boolean test(T t) {
        return false;
    }
}
