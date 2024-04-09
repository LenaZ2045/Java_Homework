package com.telran.prof.lesson_3.example_polymorphism;

public class ExampleDev {

    public static void main(String[] args) {

        Developer dev = new Developer(); // creates a list of methods that are available
        Developer bed = new BackEndDeveloper();
        Developer fed = new FrontEndDeveloper();
        DataBaseDeveloper dbd = new DataBaseDeveloper();

        dev.writeTheCode();
        bed.writeTheCode();
        fed.writeTheCode();
        dbd.writeTheCode();

        askDevToWriteCode(dev);
        askDevToWriteCode(bed);
        askDevToWriteCode(fed);
        askDevToWriteCode(dbd);

    }

    private static void askDevToWriteCode(Developer developer) { // database type is parent this is polymorphism
        developer.writeTheCode();
    }
}