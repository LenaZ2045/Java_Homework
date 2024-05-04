package com.telran.prof.homework_11_March_18_24.hospital;

import java.util.Queue;

public class Registry {

    private Queue<Patient> queueList;

    private int patientsDayLimit;

    public Registry() {
        this.patientsDayLimit = 7;
    }

    public void fillRegistry(int patientsDayLimit) {
        if (queueList.isEmpty() && !queueList.equals(this.patientsDayLimit)) {
            fillRegistry(patientsDayLimit);
        } else {
            System.out.println("Registry list is full for the day");
        }
    }

    @Override
    public String toString() {
        return "Registry{" +
                "queueList=" + queueList +
                ", patientsDayLimit=" + patientsDayLimit +
                '}';
    }
}
