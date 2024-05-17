package com.telran.prof.homework_9_March_11_24;

import java.util.Objects;

public class City {

    private String cityName;
    private int counter;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City otherCity = (City) o;
        return Objects.equals(cityName, otherCity.cityName);
    }

    public void forEach() {
        for (int i = 0; i < cityName.length(); i++) {
            City city = new City(cityName);
            System.out.println(" " + city);
            counter++;
        }
    }

    @Override
    public String toString() {
        return "City{" + "cityName='" + cityName + '\'' + ", counter=" + counter + '}';
    }
}