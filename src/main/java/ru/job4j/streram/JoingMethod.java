package ru.job4j.streram;

import java.util.List;
import java.util.stream.Collectors;

public class JoingMethod {
    public static String join(List<String> strings) {
        return strings.stream()
                .collect(Collectors
                        .joining(System.lineSeparator(), "Prefix", "Suffix"));
    }
}
