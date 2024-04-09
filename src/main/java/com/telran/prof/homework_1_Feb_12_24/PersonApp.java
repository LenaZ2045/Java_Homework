package com.telran.prof.homework_1_Feb_12_24;

public class PersonApp {

    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Romeo");
        person.setFullName("Cereal");
        person.setAge(21);

        person.move();
        person.talk();

        Person person1 = new Person("Anel", "Nouns", 25);

        person1.move();
        person1.talk();
    }
}