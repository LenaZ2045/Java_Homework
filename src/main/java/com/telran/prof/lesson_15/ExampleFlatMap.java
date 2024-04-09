package com.telran.prof.lesson_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleFlatMap {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Integer> list1 = Arrays.asList(4, 5, 6);

        List<List<Integer>> listMerged = new ArrayList<>();
        listMerged.add(list);
        listMerged.add(list1);

        // 1 2 3 4 5 6 -> 2 4 6 8 10 12

        listMerged.stream()
                .flatMap(integer -> integer.stream())
                .map(integer -> integer * 2)
                .forEach(integer -> System.out.println(" " + integer));

        List<List<List<Integer>>> testList = new ArrayList<>();
        testList.add(listMerged);

        List<Integer> collect = testList
                .stream()
                .flatMap(lists -> lists.stream())
                .flatMap(integerList -> integerList.stream())
                .map(integer -> integer * 3)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}