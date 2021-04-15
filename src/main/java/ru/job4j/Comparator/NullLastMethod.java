package ru.job4j.Comparator;

import java.util.Comparator;

public class NullLastMethod {
    public static Comparator<String> nullLast() {
        return Comparator.nullsLast(Comparator.naturalOrder());
    }
}
