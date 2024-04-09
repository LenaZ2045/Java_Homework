package com.telran.prof.lesson_11.exampleOne;

public class Student {

    private String name;
    private int rate;

    public Student(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
}
