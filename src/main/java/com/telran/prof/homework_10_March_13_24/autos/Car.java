package com.telran.prof.homework_10_March_13_24.autos;

import java.util.*;

public class Car {

    private final String carMake;
    private String color;

    private final int carVIN; // ? unique number
    private int carReg; // ? unique number
    private final CarPurpose carPurpose;

    public Car(String carMake, String color, int carVIN, int carReg, CarPurpose carPurpose) {
        this.carMake = carMake;
        this.color = color;
        this.carVIN = carVIN;
        this.carReg = carReg;
        this.carPurpose = carPurpose;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCarReg(int carReg) {
        this.carReg = carReg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carMake, carVIN);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Objects.equals(car, car.carMake);
    }

    @Override
    public String toString() {
        return "Car{" + "carMake='" + carMake + '\'' + ", color='" + color + '\'' + ", carVIN=" + carVIN + ", carReg=" + carReg + ", carPurpose=" + carPurpose + '}';
    }
}