package com.telran.prof.lesson_23.university;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UniversityApp {

    public static void main(String[] args) {
        University university = new University();

        Random randomID = new Random();
        Random randomAge = new Random();
        Random random = new Random();

        List<Student> studetnsList = new ArrayList<>();

        Faker stdNames = new Faker();
        for (int i = 0; i < 17; i++) {
            Degree randomDegree = Degree.values()[random.nextInt(Degree.values().length)];
            studetnsList.add(new Student(randomID.nextInt(17), stdNames.name().fullName(), randomAge.nextInt(18, 30), randomDegree));
        }

        System.out.println();
        System.out.println(studetnsList);
        int count = 0;
        while (count < 10) {
            for (Student student : studetnsList) {
                university.addStudent(student);
                count += 1;
            }
        }

            System.out.println();
            System.out.println(university);

            try {
                System.out.println();
                Degree randomDegree = Degree.values()[random.nextInt(Degree.values().length)];
                university.addStudent(new Student(randomID.nextInt(17), stdNames.name().fullName(), randomAge.nextInt(18, 30), randomDegree));
            } catch (CustomException e) {
                e.getMessage();
            }
            // create 5 students
            // add 5 students to University

            // Add test on class University
    }
}