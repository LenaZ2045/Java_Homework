package com.telran.prof.lesson_17;

public class DuplicatorExample {

    public static void main(String[] args) {

        String catalog = "C:\\Users\\bogyp\\Downloads\\demo\\Java_Pro-301023\\src\\main\\java\\com\\telran\\prof\\lesson_17\\files";
        Duplicator duplicator = new Duplicator(catalog);
        duplicator.duplicate("SoutExample.java", "text.txt");

    }
}