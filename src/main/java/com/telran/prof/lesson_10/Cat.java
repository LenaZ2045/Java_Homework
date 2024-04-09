package com.telran.prof.lesson_10;

import java.util.Objects;

public class Cat {

    private String name;

    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object obj) {
        System.out.println("Call equals for object " + this.name + ", " + this.age + "compare to " + obj.toString());
       if (this == obj) return true;

       if (obj == null) return false;

       if (!(obj instanceof Cat)) return false; // if it is class of the same types of classes or it is naslednik

       Cat cat = (Cat) obj; // privodim peremennyyu k class wich we wrte equals
       if (this.age != cat.age) return false;

       if (this.name == null) return cat.name == null;

       return this.name.equals(cat.name) && this.age == cat.age;
   }

    @Override
    public int hashCode() {
        System.out.println("Call hashcode for object " + this.name + ", " + this.age);
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}