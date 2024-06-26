package com.telran.prof.lesson_23.university;

import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ToString
public class University {

    //Check University size : 10 students!
    private Map<Integer, Student> students = new HashMap<>(); // key is ID, value is student

    public void addStudent(Student student) { // over value & id (getID)
        if (students.size() >= 10) {
            throw new CustomException("Can not Sign-In more than 10 students");
        }
        if (students.containsKey(student.getId())) {
            throw new CustomException("Student with this ID : " + student.getId() + ", already exists");
        }
//        } if (students.size() <= 10 && !students.containsKey(student.getId())) // check unique students (contains, put)
        students.put(student.getId(), student);
    }

    public Student excludeStudent(int id) {
        if (!students.containsKey(id)) {
            return null; // null if not found
        }
        return students.remove(id); // Implement logic to remove the student with the given ID
        // and return the removed student
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values()); // returns All students
    }

    public List<Student> getAllStudentsDegree(Degree degree) {
        List<Student> studentsWithDegree = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.getDegree() == degree) {
                studentsWithDegree.add(student);
            }
        }
        return studentsWithDegree;
    }

    public int getCountStudents() {
        int countStudent = 0;
        for (Student student : students.values()) {
//            student.toString();
            countStudent++;
        }
        return countStudent;
    }

    public int getCountStudents(Degree degree) {
        int countDegree = 0;
        for (Student student : students.values()) {
            if (student.getDegree() == degree) {
                countDegree++;
            }
        }
        return countDegree;
    }

    public int getSumAgeOfAllStudents() {
        int sumOfAges = 0; // Initialize the sum
        for (Student student : students.values()) {
            sumOfAges += student.getAge(); // Add the student's age to the sum
        }
        return sumOfAges;
    }

    public int getSumAgeOfAllStudents(Degree degree) {
        int sumOfAgesByDegree = 0; // Initialize the sum by Degree
        for (Student student : students.values()) {
            if (student.getDegree() == degree) { // calculate only ages with specific degree
                sumOfAgesByDegree += student.getAge(); // Add the student's age by degree to the sum
            }
        }
        return sumOfAgesByDegree;
    }

    public int getAverageAgeOfStudents() {
        int sumOfAges = 0;
        int totalStudents = students.size();
        for (Student student : students.values()) {
            sumOfAges += student.getAge();
        }
        if (totalStudents > 0) {
            return sumOfAges / totalStudents;
        } else {
            return 0; // Handle the case when there are no students
        }
    }
}