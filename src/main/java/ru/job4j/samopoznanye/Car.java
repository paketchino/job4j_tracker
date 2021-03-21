package ru.job4j.samopoznanye;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return year == car.year
                && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    @Override
    public String toString() {
        return "Car{"
                + "model='" + model
                + '\'' + ", year=" + year
                + '}';
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(year, car.year);
    }
}
