package com.telran.prof.lesson_9;

import java.util.HashSet;
import java.util.Set;

public class TestExampleSeven {
    public static void main(String[] args) {
        Person alex = new Person("Alex", "Age", 30);
        Person max = new Person("Max", "Pure", 35);
        Person bil = new Person("Bil", "Grieve", 49);

        System.out.println("Alex code " + alex.hashCode());
        System.out.println("Max code " + max.hashCode());
        System.out.println("Bil code " + bil.hashCode());
        Set<Person> people = new HashSet<>();
        people.add(alex);
        people.add(max);
        people.add(bil);

        System.out.println(people);
        System.out.println("Size of set is " + people.size());

        Person testPerson = new Person("Alex", "Age", 30);
        System.out.println("Alex code " + testPerson.hashCode());
        System.out.println("Is equal " + (alex == testPerson));
        people.add(testPerson);

        System.out.println(people);
        System.out.println("Size of set is " + people.size());

        alex.setAge(31);
        System.out.println("Alex new code " + alex.hashCode());

        if (people.contains(alex)) {
            System.out.println("Wow we found our Alex in the set!");
        } else {
            System.out.println("we did not find Alex in the set!!!");
        }

        people.add(alex);
        System.out.println(people);
        System.out.println("Size of set is " + people.size());

    }
}
