package com.telran.prof.lesson_10.compare_student;

import java.util.*;

public class TestCourseListenerCompare {

    public static void main(String[] args) {
        List<CourseListener> list = Arrays.asList(
                new CourseListener("Alex", 5),
                new CourseListener("Greg", 3),
                new CourseListener("Slavic", 6)

        );

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Set<CourseListener> set = new TreeSet<>();
        set.add(new CourseListener("Alex", 5));
        set.add(new CourseListener("Slavic", 6));
        System.out.println(set);
    }
}