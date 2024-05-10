package com.telran.prof.homework_11_March_18_24.hospital;

import java.util.List;

public class Registry {

    private List<Patient> queueList; // confused here, not clear understanding with parameters/types

    private int patientsDayLimit;

    public Registry() {
    }

    public void fillRegistry(int patientsDayLimit) { // confused here what to set as parameters/types
        int count = 0;
        if (queueList == null && !queueList.equals(patientsDayLimit)) {
            queueList.add((Patient) queueList);
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