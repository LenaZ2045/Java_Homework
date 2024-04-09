package com.telran.prof.lesson_11.exampleOne;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class ExamApplication {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
             new Student("Alex"),
        new Student("Oleg"),
        new Student("Max"),
        new Student("Igor"),
        new Student("Stan"));

        Random random = new Random();
        for (Student curStudent : studentList) {
            curStudent.setRate(random.nextInt(100));
        }
        System.out.println(studentList);

        PriorityQueue<Student> studentQueue = new PriorityQueue<>(new RateComparator());
        for (Student student : studentList) {
            studentQueue.add(student);
        }
        System.out.println(studentQueue);

        System.out.println("First position : " + studentQueue.poll());
        System.out.println("Second position : " + studentQueue.poll());
        System.out.println("Third position : " + studentQueue.poll());
    }
}