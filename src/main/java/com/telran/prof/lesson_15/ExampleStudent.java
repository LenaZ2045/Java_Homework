package com.telran.prof.lesson_15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStudent {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("One", 3),
                new Student("Two", 6),
                new Student("Three", 9),
                new Student("Four", 12)
        );

        for (Student student : list) {
            student.setRate(student.getRate() * 2);
        }

        System.out.println("changed rate " + list);
        List<Student> collect = list.stream().peek(student -> student.setRate(student.getRate() * 2)).filter(student -> student.getRate() > 20).collect(Collectors.toList());

        System.out.println("Rate changed but filtered ones whose rate higher " + collect);
        System.out.println("Original list " + list);
    }
}