package com.telran.prof.lesson_14.basicfuncint;

import java.util.Deque;
import java.util.function.Supplier;

public class ExampleSupplier {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();

        Supplier<Double> doubleSupplier = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };
        System.out.println(randomValue.get());
        System.out.println(doubleSupplier.get());
        System.out.println(randomValue.get());

        Supplier<User> userSupplier = () -> new User(String.valueOf(Math.random()), String.valueOf(Math.random()));

        System.out.println(userSupplier.get());
        System.out.println(userSupplier.get());
    }
}