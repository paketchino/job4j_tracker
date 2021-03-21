package ru.job4j.samopoznanye;

import java.util.*;

public class CarMain {
    public static void main(String[] args) {
        Map<Integer, Integer> cars = new HashMap<>();
        cars.put(5, 6);
        cars.put(1, 2);
        cars.put(4, 7);
        cars.put(8, 10);
        cars.put(2, 3);
        System.out.println(cars.containsValue(2));
    }
}
