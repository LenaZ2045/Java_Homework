package com.telran.prof.lesson_14.examplecomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonApp {

    public static void main(String[] args) {
        Person slava = new Person("Slava", 22);
        Person stan = new Person("Stan", 24);
        Person steve = new Person("Steve", 20);

        List<Person> personList = Arrays.asList(slava, stan, steve);
        System.out.println("1 " + personList);

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(personList, ageComparator);

        Comparator<Person> personComparator = new Comparator<Person>() { // functional interface Comparator
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()- o2.getAge();
            }
        };
        Collections.sort(personList, personComparator);
        System.out.println("2 " + personList);

        Collections.sort(personList, (o1, o2) -> o1.getAge()- o2.getAge());
        System.out.println("3 " + personList);

        Comparator<Person> personComparator2 = (o1, o2) -> o1.getAge()- o2.getAge(); // similar to above
        Collections.sort(personList, personComparator2);
        System.out.println("4 " + personList);

        Comparator<Person> personComparator3 = ((o1, o2) -> o1.getName().compareTo(o2.getName())); // similar to above
        Collections.sort(personList, personComparator3);
        System.out.println("5 " + personList);

    }
}