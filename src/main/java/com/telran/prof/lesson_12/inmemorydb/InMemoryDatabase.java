package com.telran.prof.lesson_12.inmemorydb;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase {

    private Map<Integer, Student> map = new HashMap<>();

    public void addStudent(Student student) {
        map.put(student.getId(), student);
    }

    public Student getStudent(int id) {
        if (!map.containsKey(id)) {
            System.out.println("Incorrect id " + id);
            return null;
        }
        return map.get(id);
    }

    public void deleteStudent(int id) {

    }
}