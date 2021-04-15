package ru.job4j.streram;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OptionalFlatMap {

    public static Optional<Integer> flatMap(List<String> strings)
    {
        return strings
                .stream()
                .filter(st -> st.endsWith(".java"))
                .findFirst()
                .flatMap(st1 -> Optional.of(st1.length()));
    }
}
