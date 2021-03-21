package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;

public class RealizeFunction {
    public static List<Double> diapason(int start, int end, Function<Double, Double> function) {
        List<Double> rsl = new ArrayList<>();
        for (double i = start; i < end; i++) {
            rsl.add(function.apply(i));
        }
        return rsl;
    }
}
