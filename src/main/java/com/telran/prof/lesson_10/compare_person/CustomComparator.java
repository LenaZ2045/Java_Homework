package com.telran.prof.lesson_10.compare_person;

import java.util.Comparator;

public class CustomComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int resultByName = o1.getName().compareTo(o2.getName());
        int resultByAge = o1.getAge() - o2.getAge();
        return resultByName == 0 ? resultByAge : resultByName; // in this situation if can not compare by age will compare by name
    }
}
