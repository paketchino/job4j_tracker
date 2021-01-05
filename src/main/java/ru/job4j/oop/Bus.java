package ru.job4j.oop;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едит по дорогам");
    }

    @Override
    public void wheel() {
       int wheel = 8;
        System.out.println(getClass().getSimpleName() + " имеет " + wheel + " колес");
    }
}
