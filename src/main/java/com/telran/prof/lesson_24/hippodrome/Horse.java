package com.telran.prof.lesson_24.hippodrome;

public class Horse implements Runnable, Comparable<Horse> {

    private final String name;
    private final int step;

    private final int loopLength;

    private int currentPosition = 0;

    long startTime;
    long endTime;

    public Horse(String name, int step, int loopLength) {
        this.name = name;
        this.step = step + 1;
        this.loopLength = loopLength;
    }

    public int getLoopLength() {
        return loopLength;
    }

    @Override
    public void run() {
        startTime = System.currentTimeMillis();
        while (currentPosition < loopLength) {
            try {
                Thread.sleep(10); // Call to 'Thread sleep()' in a loop, probably busy waiting? Do we need always to create sleep?
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            currentPosition += step;
            // line below shows each step after start while horses run their loop
//            System.out.println("Horse " + name + " current step = " + currentPosition);
        }
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("HORSE : " + name + ", finished 1000 meters race length at TIME = " + endTime);
    }

    @Override
    public int compareTo(Horse o1) {
        // int i = this.getLoopLength() - o1.getLoopLength(); // can be written in (return) as inlined variable
        // o1.getTime() - o2.getTime(); // planned to see time when each horse finished
        return Long.compare(this.endTime, o1.endTime); // inlined variable
    }

    @Override
    public String toString() {
        return "Horse{" + "name=" + name + ", step=" + step + ", loopLength=" + loopLength + ", currentPosition=" + currentPosition + '}';
    }
}