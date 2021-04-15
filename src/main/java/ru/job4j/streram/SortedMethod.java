package ru.job4j.streram;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {

    public static List<String> sorted(List<String> strings)
    {
        return strings
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<String> sortedReverse(List<String> strings) {
        return strings
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
