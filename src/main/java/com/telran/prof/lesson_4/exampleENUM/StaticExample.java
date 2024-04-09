package com.telran.prof.lesson_4.exampleENUM;

public class StaticExample {

    public static String hello = "Hi";

    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        System.out.println(staticExample.hello);

        StaticExample staticExample1 = new StaticExample();
        System.out.println(staticExample1.hello);

        staticExample1.hello = "Hey"; // if we would not have static variable then the changes only would apply to this variable-object

        System.out.println(staticExample.hello);
        System.out.println(staticExample1.hello);

        StaticExample staticExample2 = new StaticExample();
        System.out.println(staticExample2.hello);
    }
}
