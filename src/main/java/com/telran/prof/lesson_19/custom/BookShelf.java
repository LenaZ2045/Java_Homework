package com.telran.prof.lesson_19.custom;

import java.util.Arrays;
import java.util.List;

public class BookShelf {

    private List<Book> books;

    public BookShelf() {
        books = Arrays.asList(
                new Book("One"),
                new Book("Two"),
                new Book("Three")
        );
    }

    public Book searchByName(String name) {
        if (name.startsWith(".")) {
            throw new IncorrectBookNameException("YOur book name is empty");
        }
        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        throw new BookNotFoundException("Book with name " + name + " not found");
    }
}