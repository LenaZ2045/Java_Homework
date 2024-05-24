package com.telran.prof.homework_11_March_18_24.hospital;

public class Therapy extends Patient { // would like to see how do I use this class
// Do I have to create class DOCTOR?
    private boolean urgentCarePatient;
// do not have clear understanding what fields, constructors, methods my each class should to have
    public Therapy(String patientName, int numberOfQueue, Stage status, boolean urgent, boolean urgentCarePatient) {
        super(patientName, numberOfQueue, status,urgent);
        this.urgentCarePatient = urgentCarePatient;
    }

    @Override
    public String toString() {
        return "Therapy{" +
                ", urgentCarePatient='" + urgentCarePatient + '\'' +
                '}';
    }
}