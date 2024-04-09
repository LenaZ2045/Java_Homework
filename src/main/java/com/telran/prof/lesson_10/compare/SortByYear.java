package com.telran.prof.lesson_10.compare;

import java.util.Comparator;

public class SortByYear implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2)  { // works as bubble sort
//        if (o1.getYear() == o2.getYear()) return 0;
//        if (o1.getYear() < o2.getYear()) return -1;
//        if (o1.getYear() > o2.getYear()) return 1;

//        int result = (o1.getYear() - o2.getYear());
//        return result;

        return o1.getYear() - o2.getYear();
    }
}
