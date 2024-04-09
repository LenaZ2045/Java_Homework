package com.telran.prof.homework_1_Feb_12_24;

public class Phone {

    private String model;
    private int number;
    private double weight;

    public Phone(String model, int number, double weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public String receiveCall(String name) {
        return name + ", is calling to you!";
    }
}