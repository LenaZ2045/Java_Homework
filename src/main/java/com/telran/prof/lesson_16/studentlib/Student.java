package com.telran.prof.lesson_16.studentlib;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private long id;

    private String name;
    private Set<String> books;

    public Student(long id, String name) {
        this.name = name;
        this.id = id;
    }

    public void addBook(String book) {
        if (this.books == null) {
            this.books = new HashSet<>();
        }
        this.books.add(book);
    }

    public Set<String> getBooks() {
        return books;
    }

    public long getId() {
        return id;
    }
}
