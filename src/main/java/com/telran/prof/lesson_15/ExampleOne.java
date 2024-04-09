package com.telran.prof.lesson_15;

import java.util.Arrays;
import java.util.List;

public class ExampleOne {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        for (Integer element : list) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        list.stream().filter(element -> element %2 == 0)
                .forEach(integer -> System.out.println(" " + integer));

        // integerList -> 1, 2, 3, 4, 5, 6, 7, 8 -> 2, 4, 6, 8 -> 2 4 6 8

        // Data structure
        //.
        // stream
        //.
        // at the enter and exiting of the intermediate operation - it is stream
        // intermediate re-educate
        //.
        // intermediate
        // .....
        // intermediate
        //.
        // terminal (end of stream) result work
    }
}