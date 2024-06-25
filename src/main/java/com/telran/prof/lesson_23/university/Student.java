package com.telran.prof.lesson_23.university;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Student {

    private int id;
    @EqualsAndHashCode.Exclude
    private String name;
    @EqualsAndHashCode.Exclude
    private int age;
    @EqualsAndHashCode.Exclude
    private Degree degree;

    public String toString() {
        return "\n Student : " +"id = " + id + "; name = " + name + "; age = " + age + "; degree = " + degree;
    }
}