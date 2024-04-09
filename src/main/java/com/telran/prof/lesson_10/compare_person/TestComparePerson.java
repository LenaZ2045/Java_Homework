package com.telran.prof.lesson_10.compare_person;

import java.util.*;

public class TestComparePerson {

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Alex", 54),
                new Person("Alex", 30),
                new Person("Alex", 20),
                new Person("Alex", 10),
                new Person("Alex", 53)
        );
        System.out.println(list);
        CustomComparator customComparator = new CustomComparator();
        Collections.sort(list, customComparator); // sorting by two different fields
        System.out.println(list);

        Set<Person> personSet = new TreeSet<>(customComparator);
        personSet.add(new Person("Alex", 54));
        personSet.add(new Person("Alex", 20));
        personSet.add(new Person("Alex", 10));
        System.out.println(personSet);
    }
}
