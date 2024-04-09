package com.telran.prof.homework_1_Feb_12_24;

public class Person {

    private String name;
    private String fullName;
    private int age;

    public Person() {
        //
    }

    public Person(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println("Person " + fullName + " is coming.");
    }

    public void talk() {
        System.out.println("Person " + fullName + " is talking.");
    }
}