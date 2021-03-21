package ru.job4j.samopoznanye;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> date = new HashMap<>();
        date.put(1111, "Roman");
        date.put(2222, "Petr");
        date.put(3333, "Vowa");
        date.put(4444, "Alexey");
        System.out.println(date.get(1111));
        date.putIfAbsent(2332, "Alexsand");
        System.out.println(date.keySet());
        System.out.println(date.values());
    }
}
