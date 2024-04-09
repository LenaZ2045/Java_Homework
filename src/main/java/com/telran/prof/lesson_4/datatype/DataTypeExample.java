package com.telran.prof.lesson_4.datatype;

public class DataTypeExample {

    public static void main(String[] args) {
        // int, byte, short, char, long, double, float, boolean - primitive data types
        // String, Class, Interfaces, Enums, Arrays - reference data types
        // Examples of creating different data types

        int count = 10;
        System.out.println("Count " + count);
        incCount(count); // incCount(10)
        System.out.println("New count " + count);

        int i = incCount2(count);
        System.out.println("Brand new count after method call intCount2 " + i);

    }
    private static void incCount(int count) {
        //int count = 10;
        System.out.println("Count from method before " + count);
        count = count + 1;
        System.out.println("Count from method after " + count);
    }
    private static int incCount2(int count) {
        //int count = 10;
        System.out.println("Count from method before " + count);
        count = count + 1;
        System.out.println("Count from method after " + count);
        return count; // returns meaning
    }
}
