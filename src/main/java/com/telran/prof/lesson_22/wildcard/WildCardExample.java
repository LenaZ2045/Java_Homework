package com.telran.prof.lesson_22.wildcard;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {

    public static void main(String[] args) {
        StudentPerson alex = new StudentPerson("Alex");
        StudentPerson oleg = new StudentPerson("Oleg");
        Person maxim = new Person("Maxim");

        List<Person> people  = new ArrayList<>();
        people.add(alex);
        people.add(oleg);
        people.add(maxim);

        List<StudentPerson> studentPeople = new ArrayList<>();
        studentPeople.add(alex);
        studentPeople.add(oleg);

        checkPersonAndAdd(people);
//        checkPersonAndAdd(studentPeople); // conflicts with two different classes names

        checkPerson(studentPeople);
        addPerson(studentPeople);
    }
    private static void checkPersonAndAdd(List<Person> people) {
        for(Person person : people) {
            System.out.println(person);
        }
        StudentPerson gena = new StudentPerson("Gena");
        people.add(gena);
    }

    //PECS - Producer Extends, Consumer Super

    // ? extends SomeClass - accepts input type of data which is an inheritor
    private static void checkPerson(List<? extends Person> people) { // may be a class which extends Person, in our situation it is StudentPerson
        for (Person person : people) { // for reading
            System.out.println(person); // prints for us list which is a Producer
        }
    }

    //? super SomeClass - accepts input takes type of data which is a parent or is a SomeClass
    private static void addPerson(List<? super StudentPerson> people) {
        StudentPerson egor = new StudentPerson("Egor"); // for adding
        people.add(egor); // accepts new elements and is a Consumer
    }
}