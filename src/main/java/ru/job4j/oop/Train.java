package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " ездит по рельсам");
    }

    @Override
    public void wheel(int wheel) {
        wheel = 0;
        System.out.println(getClass().getSimpleName() + " не имеет колес");
    }
}
