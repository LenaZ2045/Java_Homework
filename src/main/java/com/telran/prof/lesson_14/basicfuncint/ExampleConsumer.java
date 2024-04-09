package com.telran.prof.lesson_14.basicfuncint;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExampleConsumer {

    public static void main(String[] args) {
        Consumer<String> printer = new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        }; // see below the lambda

        // Consumer -> accept (T t) takes only one argument does not return anything
        Consumer<String> printerLambda = s -> { // lambda
            System.out.println(s.toUpperCase());
        };
        printerLambda.accept("WeLcomE");

        // Consumer accept ( T, U) input first argument input second argument
        BiConsumer<String, String> concatPrinter = (s1, s2) -> {
            System.out.println(" s-1 " + s1);
            System.out.println(" s-2 " + s2);
            System.out.println(" " + s1 + " " + s2);
        };
        concatPrinter.accept("I ", "Study");

        Consumer<List<Integer>> multiplyingList = list -> list.forEach(value -> System.out.println(value * 2));
        List<Integer> listNumbers = Arrays.asList(2, 4, 6, 8);
        multiplyingList.accept(listNumbers);

        // intConsumer, lingConsumer, doubleConsumer are functional interfaces
    }
}
