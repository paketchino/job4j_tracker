package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer = (i, s) -> map.put(i, s);
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");

        BiPredicate<Integer, String> biPredicate = (i, s) -> i % 2 == 0 || map.get(i).length() == 4;
        for (Integer i : map.keySet()) {
            if (biPredicate.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }

        Supplier<List<String>> supplier = () -> new ArrayList<>(map.values());
        Consumer<String> consumer = (s) -> System.out.println(s);
        Function<String, String> function = (s) -> s.toUpperCase();
        for (String s : map.values()) {
            function.apply(s);
        }
    }
}
