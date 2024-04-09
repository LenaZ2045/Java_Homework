package com.telran.prof.lesson_4.exampleENUM;

public enum PassportType {
    NEW(1950, 2000),
    OLD(1900, 1949);

    private  int startYear;
    private  int endYear;

    PassportType(int startYear, int endYear) {
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }
}
