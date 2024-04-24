package com.telran.prof.homework_10_March_13_24.comparator;

import com.telran.prof.homework_10_March_13_24.model.Book;

import java.util.Comparator;

public class SortByAuthorBirthYear implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBookAuthor().getAuthorBirthDate() - (o2.getBookAuthor().getAuthorBirthDate());
    }
}