package com.telran.prof.lesson_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExampleMap {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("One", 3),
                new Student("Two", 6),
                new Student("Three", 9),
                new Student("Four", 12)
        );

        List<String> nameList = new ArrayList<>();
        for (Student student : studentList) {
            nameList.add(student.getName());
        }
        System.out.println(nameList);

        Function<Student, String> convertStudentToName = new Function<Student, String>() {
                    @Override
                    public String apply(Student student) {
                        return student.getName();
                    }
                };

        List<String> names = new ArrayList<>();
        for(Student student : studentList) {
            String name = convertStudentToName.apply(student);
            names.add(name);
        }

        //map - intermediate, covert object form one type to other, or one to one
        List<String> studentNames = studentList.stream().map(student -> student.getName()).collect(Collectors.toList());

        List<String> list = Arrays.asList("one", "hello", "bye", "end");
        List<String> collect = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);
        Function<String, String> upperCase = s -> s.toUpperCase();

        // In class task
        List<String> studentUpperCase = studentList.stream()
                .map(student -> student.getName())
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(studentUpperCase);
    }
}
