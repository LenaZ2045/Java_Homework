package com.telran.prof.lesson_16.studentlib;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LibApp {

    public static void main(String[] args) {
        Student alex = new Student(1, "Alex");
        alex.addBook("Java 8");
        alex.addBook("Spring Boot in Action");
        alex.addBook("Kotlin in Action");
        alex.addBook("CTCI");

        Student tom = new Student(2, "Tom");
        tom.addBook("Java 9");
        tom.addBook("Spring Boot in Action");
        tom.addBook("Kotlin in Action");

        Student slava = new Student(3, "Slava");
        slava.addBook("Java 9");
        slava.addBook("Spring Boot in Action");
        tom.addBook("Kotlin in Action");
        alex.addBook("CTCI");
        slava.addBook("effective Java");

        List<String> readBooks = Stream.of(alex, tom)
                .map(student -> student.getBooks())
                .flatMap(books -> books.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(readBooks);

        List<Student> students = Arrays.asList(alex, tom, slava);
        for (Student studet : students) {
            if (studet.getBooks().size() > 3) {
            }
        }
//        Student student = findById(long id);

            List<Long> collect = students.stream()
                    .filter(student1 -> student1.getBooks().size() > 3)
                    .map(student1 -> student1.getId())
                    .collect(Collectors.toList());
//            List<Student>

    }
}