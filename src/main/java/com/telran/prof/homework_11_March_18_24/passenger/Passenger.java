package com.telran.prof.homework_11_March_18_24.passenger;

public class Passenger {

    private final String passenger;

    private final int classification;

    public Passenger(String passenger, int classification) {
        this.passenger = passenger;
        this.classification = classification;
    }

    public int getClassification() {
        return classification;
    }

    @Override
    public String toString() {
        return "Passenger{" + "passenger='" + passenger + '\'' + ", classification=" + classification + '}';
    }
}