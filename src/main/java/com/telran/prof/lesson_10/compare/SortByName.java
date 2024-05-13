package com.telran.prof.lesson_10.compare;

import java.util.Comparator;

public class SortByName implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getName().compareTo(o2.getName()); // compareTo method realised by String by alphabetically
    }
}