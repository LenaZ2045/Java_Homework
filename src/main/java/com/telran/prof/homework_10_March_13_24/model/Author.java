package com.telran.prof.homework_10_March_13_24.model;

public class Author {

    private final String authorName;
    private final int authorBirthYear;

    public Author(String authorName, int authorBirthYear) {
        this.authorName = authorName;
        this.authorBirthYear = authorBirthYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getAuthorBirthDate() {
        return authorBirthYear;
    }

    @Override
    public String toString() {
        return "Author{" + "authorName='" + authorName + '\'' + ", authorBirthDate=" + authorBirthYear + '}';
    }
}