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
        System.out.println(patientsQueue);

        for (Patient patient : patientsQueue) {
            if (patient.isUrgent()) {
                patient.setStatus(Stage.AT_THE_DOCTOR);
            }
        }

        System.out.println(" 2. PATIENTS AT DOCTOR'S REPORT : ");
        for (Patient doctorList : patientsQueue) {
            if (doctorList.getStatus().equals(Stage.AT_THE_DOCTOR)) {
                System.out.println(doctorList);
            }
        }

        System.out.println(" 3. URGENT PATIENTS SEEN BY QUEUE : ");
        Comparator<Patient> urgentComparator = Comparator.comparing(c -> c.getNumberOfQueue());
        Queue<Patient> registryQueueUrgent = new PriorityQueue<>(urgentComparator);
        int queueLimitOne = 0;
        for (Patient urgentPatient : patientsQueue) {
            if (urgentPatient.isUrgent()) {
                registryQueueUrgent.add(urgentPatient);
            }
        }
        System.out.println(registryQueueUrgent.size());

        while (!registryQueueUrgent.isEmpty() && registryQueueUrgent.size() != 0) {
            queueLimitOne = 0;
            int countOne = 1;
            System.out.println();
            while (queueLimitOne != 7) {
                if (registryQueueUrgent.isEmpty()) {
                    System.out.println("Urgent patient list HAD SERVED");
//                    return;
                }
                System.out.println(countOne + " of 7 " + registryQueueUrgent.poll());
                queueLimitOne++;
                countOne++;
            }
            if (queueLimitOne == 7) {
                System.out.println("Start NEXT list of 7 urgent patients");
            }
            System.out.println(registryQueueUrgent.size());
        }

        for (Patient patient : patientsQueue) {
            if (patient.getStatus().equals(Stage.AT_THE_DOCTOR)) {
                patient.setStatus(Stage.RELEASED);
            } else {
                patient.setStatus(Stage.AT_THE_DOCTOR);
            }
        }

        System.out.println(" 4. NON-URGENT PATIENTS SEEN BY QUEUE : ");
        Comparator<Patient> notUrgentComparator = Comparator.comparing(c -> c.getNumberOfQueue());
        Queue<Patient> registryQueueNotUrgent = new PriorityQueue<>(notUrgentComparator);
        int queueLimitTwo = 0;
        for (Patient notUrgentPatient : patientsQueue) {
            if (!notUrgentPatient.isUrgent()) {
                registryQueueNotUrgent.add(notUrgentPatient);
            }
        }
        System.out.println(registryQueueNotUrgent.size());

        while (!registryQueueNotUrgent.isEmpty() && registryQueueNotUrgent.size() != 0) { // I could not set only 7 patients for one registry queue
            queueLimitTwo = 0;
            int countTwo = 1;
            System.out.println();
            while (queueLimitTwo != 7) {
                if (registryQueueNotUrgent.isEmpty()) {
                    System.out.println("Non-Urgent patient list HAD SERVED");
//                            return;
                }
                System.out.println(countTwo + " of 7 " + registryQueueNotUrgent.poll());
                queueLimitTwo++;
                countTwo++;
            }
            if (queueLimitTwo == 7) {
                System.out.println("Start NEXT list of 7 urgent patients");
            }
            System.out.println(registryQueueNotUrgent.size());
        }

        for (Patient patient : patientsQueue) {
            if (patient.getStatus().equals(Stage.AT_THE_DOCTOR)) {
                patient.setStatus(Stage.RELEASED);
            }
        }

        System.out.println(" 5. RELEASED PATIENTS BY QUEUE : ");
        Comparator<Patient> queueComparator = Comparator.comparing(c -> c.getNumberOfQueue());
        Queue<Patient> releasedUrgentQueue = new PriorityQueue<>(queueComparator);
        for (Patient releasedUrgentPatient : patientsQueue) {
            if (releasedUrgentPatient.isUrgent()) {
                releasedUrgentQueue.add(releasedUrgentPatient);
            }
        }
        System.out.println("Released Urgent Patients : ");
        while (!releasedUrgentQueue.isEmpty()) {
            System.out.println(releasedUrgentQueue.poll());
        }

        Queue<Patient> releasedNotUrgentQueue = new PriorityQueue<>(queueComparator);
        for (Patient releasedNotUrgentPatient : patientsQueue) {
            if (!releasedNotUrgentPatient.isUrgent()) {
                releasedNotUrgentQueue.add(releasedNotUrgentPatient);
            }
        }
        System.out.println("Released Not-Urgent Patients : ");
        while (!releasedNotUrgentQueue.isEmpty()) {
            System.out.println(releasedNotUrgentQueue.poll());
        }
        System.out.println("ALL patients from registry HAD SERVED");

    }
}