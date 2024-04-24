package com.telran.prof.homework_10_March_13_24.model;

public class Book { // suggested that class can be a record (not familiar)

    private final String bookName;

    private final int bookYear;

    private final int bookPages;
    private final Author bookAuthor;

    public Book(String bookName, int bookYear, int bookPages, Author bookAuthor) {
        this.bookName = bookName;
        this.bookYear = bookYear;
        this.bookPages = bookPages;
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookYear() {
        return bookYear;
    }

    public int getBookPages() {
        return bookPages;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" + "bookName='" + bookName + '\'' + ", bookYear=" + bookYear + ", bookPages=" + bookPages + ", bookAuthor=" + bookAuthor + '}';
    }
}