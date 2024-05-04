package com.telran.prof.homework_11_March_18_24.hospital;

public class Therapy extends Patient {

    private boolean urgentCarePatient;

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