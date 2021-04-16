package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class KeySet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(
                Map.of(
                        1, "root@root",
                        2, "local@local",
                        3, "host@host"
                ));
        for (Integer i : map.keySet()) {
            System.out.println(i + " - " + map.get(i));
        }
    }
}
