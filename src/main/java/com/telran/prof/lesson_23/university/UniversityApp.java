package com.telran.prof.lesson_23.university;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UniversityApp {

    public static void main(String[] args) {
        University university = new University();

        Random randomAge = new Random();
        Random random = new Random();

        List<Student> studetnsList = new ArrayList<>();

        Faker stdNames = new Faker();
        for (int i = 0; i < 10; i++) {
            Degree randomDegree = Degree.values()[random.nextInt(Degree.values().length)];
            studetnsList.add(new Student(i, stdNames.name().fullName(), randomAge.nextInt(18, 30), randomDegree));
        }

        System.out.println();
        System.out.println("LIST " + studetnsList);
        int count = 0;
        while (count < 10) {
            for (Student student : studetnsList) {
                university.addStudent(student);
                count += 1;
            }
        }

        System.out.println();
        System.out.println("MAP " + university);

        try {
            System.out.println();
            Random randomID = new Random();
            Degree randomDegree = Degree.values()[random.nextInt(Degree.values().length)];
            university.addStudent(new Student(randomID.nextInt(9), stdNames.name().fullName(), randomAge.nextInt(18, 30), randomDegree));
        } catch (CustomException e) {
            System.out.println("CustomException = " + e.getMessage());
        }

        System.out.println();
        System.out.println("Student with Existing ID '9' excluded = " + university.excludeStudent(9));
        System.out.println("Student with ID '11' is Null ID = " + university.excludeStudent(11));
        System.out.println();
        System.out.println("Student List = " + university.getAllStudents());
        System.out.println();
        System.out.println("Bachelor Degree student list = " + university.getAllStudentsDegree(Degree.Bachelor));
        System.out.println();
        System.out.println("Student quantity after exclusion = " + university.getCountStudents());

        System.out.println("Master's degree student quantity = " + university.getCountStudents(Degree.Master));

        System.out.println("Sum of all ages in university = " + university.getSumAgeOfAllStudents());

        System.out.println("Sum of all ages in university in Bachelor degree = " + university.getSumAgeOfAllStudents(Degree.Bachelor));

        System.out.println("Average age of students in university = " + university.getAverageAgeOfStudents());
    }
}