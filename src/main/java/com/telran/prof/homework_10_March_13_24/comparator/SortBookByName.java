package com.telran.prof.homework_10_March_13_24.comparator;

import com.telran.prof.homework_10_March_13_24.model.Book;

import java.util.Comparator;

public class SortBookByName implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBookName().compareTo(o2.getBookName());
    }
}