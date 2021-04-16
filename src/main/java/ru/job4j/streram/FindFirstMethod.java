package ru.job4j.streram;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFirstMethod {
    public static Optional<Integer> first(List<Integer> list) {
        return list.stream().findFirst();
    }

    public static List<Integer> map(List<Integer> numbers) {
        return numbers.stream().map(n -> n * n).collect(Collectors.toList());
    }

    public static List<String> mapString(List<String> names) {
        return names.stream().map(j -> j + ".java").collect(Collectors.toList());
    }
}
