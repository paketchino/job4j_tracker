package ru.job4j.tracker;

public class ShapeFactory {

    private final ShapeAbsFactory factory;

    public ShapeFactory(ShapeAbsFactory factory) {
        this.factory = factory;
    }

}
