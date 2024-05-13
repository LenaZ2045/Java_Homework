package com.telran.prof.lesson_16.itemapp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ItemApp {

    public static void main(String[] args) {
        List<Item> list = Arrays.asList(
                new Item("Phone", 25),
                new Item("Milk", 15),
                new Item("Bread", 2),
                new Item("Table", 35),
                new Item("Phone", 25),
                new Item("Phone", 55),
                new Item("Door", 50),
                new Item("Paper", 4),
                new Item("Beer", 5),
                new Item("Beer", 65));

        // .collect(Collector.toSet())

        Set<Item> collect = list.stream()
                .filter(item -> item.getPrice() > 15)
                .collect(Collectors.toSet()); // set has no order and set does not keep duplicates
        System.out.println(collect);

        // reduce - terminal operator, which converts all elements into one by logic we write
        Optional<Integer> reduce = list.stream()
                .filter(item -> item.getPrice() > 15)
                .distinct() // Stream distinct() method where element occurs
                // first will be present in the distinct elements stream
                // no duplicates
                .map(item -> item.getPrice())
                // with set map we do not have strict order
                .reduce((a, b) -> (a + b));
        // Optional - class has method in for null (stream API) it is a shell class for NULL Pointer Exception
        // .collect(Collectors.toList());
        // Integer integer = reduce.orElse(0);
        // boolean present = reduce.isPresent();
        // reduce.orElseThrow()
        System.out.println("Items sum total price is " + reduce.get());

        Optional<Item> first = list.stream()
                .filter(item -> item.getPrice() > 100)
                .findFirst();
        System.out.println(first.isPresent() ? "Yes" : "No");
    }
}