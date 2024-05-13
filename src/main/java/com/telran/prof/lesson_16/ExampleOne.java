package com.telran.prof.lesson_16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleOne {

    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 2, 4, 5, 6}; // one-dimensional array
        Arrays.stream(arr).forEach(System.out::println);

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 9, 10}}; //multidimensional array
        // double array
        Arrays.stream(array).forEach(element -> System.out.println(Arrays.toString(element)));

        Arrays.stream(array).flatMapToInt(arrays -> Arrays.stream(arrays)).forEach(value -> System.out.println(" " + value));

        // List.of() // to run through collection
        // Set.of() // to run through collection

        // Stream.of(arr). // filters element value
        Stream.of(arr).forEach(element -> System.out.println(Arrays.toString(element)));

        // 1 2 3 4 5
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        Stream<int[]> arr1 = Stream.of(arr);

        Stream.of(arr)
                .flatMapToInt(Arrays::stream)
                .forEach(x -> System.out.println(" " + x));

        List<String> list = Arrays.asList("Hello", "Java", "Class", "JDK", "SQL");

        List<String> collect = Stream.of("Hello", "Java", "Class", "JDK", "SQL")
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println("\n" + collect);

        // exclude "a' task in class
        String[][] string = {{"a", "b"}, {"c", "d"}, {"a", "f"}};
        Stream.of(string)
                .flatMap(Arrays::stream)
                .filter(e -> !e.equals("a"))
                .forEach(System.out::println);
    }
}