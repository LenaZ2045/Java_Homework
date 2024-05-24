package com.telran.prof.lesson_24.arrayexample;

public class MthCounter implements Runnable{

    private int[] array;

    private int start;

    private  int end;

    private int resultIndex;
    private int[] resultArray;

    public MthCounter(int[] array, int start, int end, int resultIndex, int[] resultArray) {
        this.array = array;
        this.start = start;
        this.end = end;
        // for instance
        this.resultIndex = resultIndex;
        this.resultArray = resultArray;
    }

    @Override
    public void run() {
            int sum = 0;
            for(int i = start; i < end; i++) {
                sum += array[i];
                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            resultArray[resultIndex] = sum;
        }
    }