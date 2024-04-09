package com.telran.prof.lesson_10.selfwork;

import com.telran.prof.lesson_10.Cat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestExampleThree {

    public static void main(String[] args) {
        Cat museum = new Cat("museum", 10);
        Cat bureau = new Cat("bureau", 7);
        Cat stewart = new Cat("stewart", 5);

        Set<Cat> cats = new HashSet<>();
        cats.add(museum);
        cats.add(bureau);
        cats.add(stewart);

        System.out.println("cats contains catTwo = " + cats.contains(bureau));

        System.out.println("\nSearch from list : ");
        List<Cat> list = Arrays.asList(museum, stewart, bureau);
        list.contains(bureau);

    }
}