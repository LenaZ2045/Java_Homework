package com.telran.prof.homework_11_March_18_24.hospital;

import java.util.List;

public class Registry {

    private List<Patient> queueList; // confused here, not clear understanding with parameters/types

    private int patientsDayLimit = 7;

    public Registry() {
    }

    public void fillRegistry(int patientsDayLimit, Patient patient) { // confused here what to set as parameters/types
        int count = 0;
        if (!queueList.equals(patientsDayLimit)) {
            queueList.add(patientsDayLimit, patient);
            count++;
            System.out.println("Registry list is NOT FULL " + count);
        } else {
            System.out.println("Registry list IS FULL for the day" + count);
        }
    }

    @Override
    public String toString() {
        return "Registry{" + "queueList=" + queueList + ", patientsDayLimit=" + patientsDayLimit + '}';
    }
}