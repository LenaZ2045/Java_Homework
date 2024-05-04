package com.telran.prof.homework_11_March_18_24.hospital;

import java.util.*;

public class HospitalRecordApp {

    public static void main(String[] args) {
        List<Patient> patientsQueue = Arrays.asList(
                new Patient("Ale", 1, Stage.IN_QUEUE, true),
                new Patient("Bob", 2, Stage.IN_QUEUE, false),
                new Patient("Cus", 3, Stage.IN_QUEUE, true),
                new Patient("Dan", 4, Stage.IN_QUEUE, true),
                new Patient("Eva", 5, Stage.IN_QUEUE, false),
                new Patient("Fog", 6, Stage.IN_QUEUE, true),
                new Patient("Gal", 7, Stage.IN_QUEUE, false),
                new Patient("Ham", 8, Stage.IN_QUEUE, false),
                new Patient("Ice", 9, Stage.IN_QUEUE, false),
                new Patient("Jam", 10, Stage.IN_QUEUE, true),
                new Patient("Kim", 11, Stage.IN_QUEUE, false),
                new Patient("Lid", 12, Stage.IN_QUEUE, false),
                new Patient("Mop", 13, Stage.IN_QUEUE, false),
                new Patient("Nod", 14, Stage.IN_QUEUE, true),
                new Patient("Ork", 15, Stage.IN_QUEUE, true),
                new Patient("Pal", 16, Stage.IN_QUEUE, false),
                new Patient("Que", 17, Stage.IN_QUEUE, false),
                new Patient("Rum", 18, Stage.IN_QUEUE, false),
                new Patient("Set", 19, Stage.IN_QUEUE, true),
                new Patient("Tom", 20, Stage.IN_QUEUE, false),
                new Patient("Uef", 21, Stage.IN_QUEUE, true));

        for (Patient patient : patientsQueue) {
            if (patient.isUrgent()) {
                patient.setStatus(Stage.AT_THE_DOCTOR);
            }
            System.out.println(patient);
        }
        System.out.println();
        Queue<Patient> queue = new ArrayDeque<>(patientsQueue);
        while (!queue.isEmpty()) {
            System.out.println("Patients report : " + queue.poll());
        }

//        for (Patient emergencyPatient : patientsQueue) {
//            int patientsDayLimit = 7;
//            emergencyPatient.fillRegistry(patientsDayLimit);
//        }

        System.out.println();
        Comparator<Patient> urgentComparator = Comparator.comparing(c -> !c.isUrgent());
        Queue<Patient> registryQueue = new PriorityQueue<>(urgentComparator);
        registryQueue.addAll(patientsQueue);
        while (!registryQueue.isEmpty()) {
            System.out.println("Emergency patients : " + registryQueue.poll());
        }

        System.out.println();
        for (Patient patient : patientsQueue) {
            if (patient.getStatus().equals(Stage.AT_THE_DOCTOR)) {
                patient.setStatus(Stage.RELEASED);
            } else {
                patient.setStatus(Stage.AT_THE_DOCTOR);
            }
            System.out.println(patient);
        }
    }
}