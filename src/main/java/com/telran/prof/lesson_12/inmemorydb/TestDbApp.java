package com.telran.prof.lesson_12.inmemorydb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDbApp {

    public static void main(String[] args) {

        Student alex = new Student(1, "Alex", 35);
        Student oleg = new Student(2, "Oleg", 20);
        Student igor = new Student(3, "Igor", 30);
        Student stan = new Student(4, "Stan", 55);

        List<Student> students = Arrays.asList(alex, oleg, igor, stan);
        int id = 3;
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Found " + student);
            }
        }

        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        students.forEach(student -> inMemoryDatabase.addStudent(student));
        Student databaseStudent = inMemoryDatabase.getStudent(id);
        System.out.println("Found " + databaseStudent);

        Map<Integer, Student> map = new HashMap<>();
        map.put(alex.getId(), alex);
        map.put(2, oleg);
        map.put(igor.getId(), igor);
        map.put(stan.getId(), stan);

        Student student = map.get(id);
        System.out.println("Found " + student);
    }
}