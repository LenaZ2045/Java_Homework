package com.telran.prof.homework_10_March_13_24.model;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private final List<Book> booksList = new ArrayList<>();

    public void addBook(Book book) {
        booksList.add(book);
        System.out.println("Book added on the bookshelf");
    }

    public void takeBook(BookShelf book) {
        if (!booksList.isEmpty()) {
            booksList.remove(book);
        } else {
            System.out.println("The bookshelf is empty");
        }
    }

    @Override
    public String toString() {
        return "BookShelf{" + "booksList=" + booksList + '}';
    }
}