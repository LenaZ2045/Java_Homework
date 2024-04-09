package com.telran.prof.lesson_11.exampleOne;

import java.util.Comparator;

public class RateComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) { // using in reverse comparator
        return (-1)*(o1.getRate() - o2.getRate()); // this code specifically returns the max value first
    }
}
