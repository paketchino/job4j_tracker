package ru.job4j.oop;

public class Airport {
    public static void main(String[] args) {
        final Airbus airbus = new Airbus("A320");
        System.out.println(airbus);
        airbus.printCountEngine();
        airbus.printModel();

        airbus.setName("A380");
        System.out.println(airbus);
    }
}
