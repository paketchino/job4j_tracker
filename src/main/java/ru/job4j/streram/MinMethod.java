package ru.job4j.streram;

import java.util.Comparator;
import java.util.List;

public class MinMethod {
    public static String min(List<String> list) {
        return list.stream().min((x, y) -> x.compareTo(y)).get();
    }
}
