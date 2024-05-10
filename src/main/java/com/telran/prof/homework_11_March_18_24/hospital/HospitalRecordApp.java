package com.telran.prof.homework_11_March_18_24.hospital;

import com.github.javafaker.Faker;

import java.util.*;

public class HospitalRecordApp {

    public static void main(String[] args) {
        Faker pullList = new Faker();
        List<Patient> patientsQueue = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 21; i++) {
            patientsQueue.add(new Patient(pullList.name().fullName(), pullList.number().numberBetween(1, 100), Stage.IN_QUEUE, random.nextBoolean()));
        }

        System.out.println(" 1. COMPLETE LIST OF PATIENTS : ");
        for (Patient patient : patientsQueue) {
            if (patient.isUrgent()) {
                patient.setStatus(Stage.AT_THE_DOCTOR);
            }
            System.out.println(patient);
        }

        System.out.println(" 2. PATIENTS AT DOCTOR'S REPORT : ");
        for (Patient doctorList : patientsQueue) {
            if (doctorList.getStatus().equals(Stage.AT_THE_DOCTOR)) {
                System.out.println(doctorList);
            }
        }

        System.out.println(" 3. URGENT PATIENTS SEEN BY QUEUE : ");
        Comparator<Patient> urgentComparator = Comparator.comparing(c -> c.getNumberOfQueue());
        int queueLimit = 7;
        Queue<Patient> registryQueue = new PriorityQueue<>(queueLimit, urgentComparator);
        for (Patient patient : patientsQueue) {
            if (patient.isUrgent()) {
                registryQueue.offer(patient);
            }
        }
        while (!registryQueue.isEmpty()) { // I could not set only 7 patients for one registry queue
            System.out.println(registryQueue.poll());
        }

        for (Patient patient : patientsQueue) {
            if (patient.getStatus().equals(Stage.AT_THE_DOCTOR)) {
                patient.setStatus(Stage.RELEASED);
            } else {
                patient.setStatus(Stage.AT_THE_DOCTOR);
            }
        }

        System.out.println(" 4. RELEASED URGENT PATIENTS BY QUEUE : ");
        Comparator<Patient> queueComparator = Comparator.comparing(c -> c.getNumberOfQueue());
        Queue<Patient> releasedQueue = new PriorityQueue<>(queueComparator);
        for (Patient releasedPatient : patientsQueue) {
            if (releasedPatient.getStatus().equals(Stage.RELEASED)) {
                releasedQueue.offer(releasedPatient);
            } else {
                releasedPatient.setStatus(Stage.RELEASED);
            }
        }
        while (!releasedQueue.isEmpty()) {
            System.out.println(releasedQueue.poll());
        }

        System.out.println(" 5. RELEASED OTHER PATIENTS BY QUEUE : ");
        Queue<Patient> otherPatients = new PriorityQueue<>(queueComparator);
        for (Patient leftPatient : patientsQueue) {
            otherPatients.offer(leftPatient);
        }
        while (!otherPatients.isEmpty()) {
            System.out.println(otherPatients.poll());
        }
    }
}