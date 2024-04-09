package com.telran.prof.lesson_10.selfwork;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private Contact contact;

    public Student(String name, int age, Contact contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!(obj instanceof Student)) return false;
        Student student = (Student) obj;
//        if (this.age != student.age) return false;
//        if (this.name == null) return student.name == null;
//        if (this.contact != student.contact) return false; // make sure if it is ccilochniy type then need to write "equals"
        // return this.name.equals(student.name) && this.age == student.age && this.contact.equals(student.contact):
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(contact, student.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, contact);
    }
}
