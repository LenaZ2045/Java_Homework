package com.telran.prof.lesson_4.datatype;

public class PersonExample {

    public static void main(String[] args) {
        Person alex = new Person("Alex");
        System.out.println("Person before " + alex);

        changePersonName(alex);

        System.out.println("Person after " + alex);

    }
    private  static void changePersonName(Person maxim) {
        System.out.println("Person name before change in method " + maxim);
        maxim.setName("Maxim");
        System.out.println("Person name after change in method " + maxim);

    }
}
