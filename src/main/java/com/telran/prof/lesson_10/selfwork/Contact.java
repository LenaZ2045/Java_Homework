package com.telran.prof.lesson_10.selfwork;

import java.util.Objects;

public class Contact {

    private String name;
    private int home;

    public Contact(String name, int home) {
        this.name = name;
        this.home = home;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return home == contact.home && Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, home);
    }
}
