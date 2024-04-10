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
                .collect(Collectors.toSet());
        System.out.println(collect);

        // reduce - terminal operator, which converts all elements into one by logic we write
        Optional<Integer> reduce = list.stream()
                .filter(item -> item.getPrice() > 15)
                .distinct()
                .map(item -> item.getPrice())
                .reduce((a, b) -> (a + b));
        //Optional - class has method in for null (stream API) shell class for NULL Pointer Exception
//                .collect(Collectors.toList());
//        Integer integer = reduce.orElse(0);
//        boolean present = reduce.isPresent();
        System.out.println(reduce.get());

        list.stream()
                .filter(list -> list.)
    }
}
