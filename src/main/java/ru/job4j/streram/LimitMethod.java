package ru.job4j.streram;

import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
    public static List<String> firstThree(List<String> strings) {
        return strings.stream().limit(3).collect(Collectors.toList());
    }

    public static List<String> lastThree(List<String> strings) {
        return strings.stream()
                .skip(2)
                .collect(Collectors.toList());
    }

}
