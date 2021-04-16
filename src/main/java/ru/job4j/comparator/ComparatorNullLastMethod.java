package ru.job4j.comparator;

import java.util.Comparator;

public class ComparatorNullLastMethod {
    public static Comparator<String> nullLast() {
        return Comparator.nullsLast(Comparator.naturalOrder());
    }
}
