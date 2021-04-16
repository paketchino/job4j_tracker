package ru.job4j.streram;

import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileMethod {

    public static List<Integer> takeWhile(List<Integer> list) {
        return list.stream()
                .sorted()
                .takeWhile(n -> n < 0)
                .collect(Collectors.toList());
    }

    public static List<Integer> dropWhile(List<Integer> numbers) {
        return numbers
                .stream()
                .sorted()
                .dropWhile(n -> n < 0)
                .collect(Collectors.toList());
    }
}
