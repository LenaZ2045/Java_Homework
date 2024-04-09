package com.telran.prof.lesson_9;

import java.util.Set;
import java.util.TreeSet;

public class TestExampleFour {

    public static void main(String[] args) {
        //does not work!
        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person("Alex"));
        personSet.add(new Person("Tom"));
        System.out.println(personSet);
    }
}
