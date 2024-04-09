package com.telran.prof.lesson_10.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCarCompare {

    public static void main(String[] args) {
        List<Car> list = Arrays.asList(
                new Car(2010, "Toyota-XRS"),
                new Car(1989, "Geo-Prism"),
                new Car(2016, "Mercedes-Cargo-Van"),
                new Car(2007, "Toyota-Corolla")
        );
        System.out.println("Cars list before all sort : " + list);
        SortByYear sortByYear = new SortByYear();
         Collections.sort(list, sortByYear); // not working the way without Compare implemeting  as need to create Compare class
        System.out.println("Cars after sort by year: " + list);

        SortByName sortByName = new SortByName();
        Collections.sort(list, sortByName);
        System.out.println("Cars after sort by name : " + list);

//        Comparator<Car> carComparator = new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o1.getYear() - o2.getYear();
//            }
//        }
    }
}
