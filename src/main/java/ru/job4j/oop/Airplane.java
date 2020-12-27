package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает по воздуху");
    }

    @Override
    public void wheel(int wheel) {
        wheel = 20;
        System.out.println(getClass().getSimpleName() + " имеет " + wheel + " колес");
    }
}
