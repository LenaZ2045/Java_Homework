package com.telran.prof.homework_11_March_18_24.passenger;

import java.util.*;

public class PassengerApp {

    public static void main(String[] args) {
        Passenger dog = new Passenger("Dog Moore", 1);
        Passenger abba = new Passenger("Abba Merely", 0);
        Passenger victor = new Passenger("Victor Grange", 0);
        Passenger yus = new Passenger("Yus Cross", 0);
        Passenger eric = new Passenger("Eric Whole", 1);
        Passenger bill = new Passenger("Bill Gait", 0);
        Passenger merry = new Passenger("Merry Claus ", 0);
        Passenger christie = new Passenger("Christie Moose", 0);
        Passenger sofa = new Passenger("Sofa Primo", 1);
        Passenger paul = new Passenger("Paul Stool", 0);

        List<Passenger> passengerList = Arrays.asList(dog, abba, victor, yus, eric, bill, merry, christie, sofa, paul);
        System.out.println(passengerList);

        PassengerClassification firstClassPassengers = new PassengerClassification();
        passengerList.sort(firstClassPassengers);
        System.out.println();
        System.out.println(passengerList);

        System.out.println();
        PriorityQueue<Passenger> passengerQueue = new PriorityQueue<>(new PassengerClassification());
        passengerQueue.addAll(passengerList);
        System.out.println();
        System.out.println("First Class Passenger " + (passengerQueue.poll()));
        System.out.println("First Class Passenger " + (passengerQueue.poll()));
        System.out.println("First Class Passenger " + (passengerQueue.poll()));
        System.out.println();
        System.out.println("Second Class Passenger " + (passengerQueue.poll()));
        System.out.println("Second Class Passenger " + (passengerQueue.poll()));
        System.out.println("Second Class Passenger " + (passengerQueue.poll()));
        System.out.println("Second Class Passenger " + (passengerQueue.poll()));
        System.out.println("Second Class Passenger " + (passengerQueue.poll()));
        System.out.println("Second Class Passenger " + (passengerQueue.poll()));
        System.out.println("Second Class Passenger " + (passengerQueue.poll()));
        System.out.println("Both Passenger Classes are seated = " + (passengerQueue.poll()));
    }
}