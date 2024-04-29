package com.telran.prof.homework_11_March_18_24.passenger;

import java.util.Comparator;

public class PassengerClassification implements Comparator<Passenger> {

    @Override
    public int compare(Passenger o1, Passenger o2) {
        return o2.getClassification() - o1.getClassification();
    }
}