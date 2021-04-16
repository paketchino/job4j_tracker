package ru.job4j.map;

import java.util.Map;

public class ComputeIfPresent {
    public static Map<Integer, String> collectDate(
            Map<Integer, String> name, Map<Integer, String> surname) {
        for (int id : name.keySet()) {
            name.computeIfPresent(id, (key, value) -> value + " " + surname.get(key));
        }
        return name;
    }
}
