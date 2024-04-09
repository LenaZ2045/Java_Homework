package com.telran.prof.lesson_4.exampleENUM;

public class Passport {
    private PassportType passportType;

    public Passport(PassportType passportType) {
        this.passportType = passportType;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportType=" + passportType +
                '}';
    }
}
