package com.telran.prof.homework_11_March_18_24.hospital;

public class Patient extends Registry{

    private String patientName;

    private int numberOfQueue;

    private Stage status;

    private boolean urgent;


    public Patient(String patientName, int numberOfQueue, Stage status, boolean urgent) {
        this.patientName = patientName;
        this.numberOfQueue = numberOfQueue;
        this.status = status;
        this.urgent = urgent;
    }

    public void setStatus(Stage status) {
        this.status = status;
    }

    public String getPatientName() {
        return patientName;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public int getNumberOfQueue() {
        return numberOfQueue;
    }

    public Stage getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "patientName='" + patientName + '\'' +
                ", numberOfQueue=" + numberOfQueue +
                ", status=" + status +
                ", urgency=" + urgent +
                '}';
    }
}
