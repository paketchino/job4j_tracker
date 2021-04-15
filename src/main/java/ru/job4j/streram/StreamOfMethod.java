package ru.job4j.streram;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfMethod {
    public static Stream<String> createStream() {
        return Stream.of("a", "b", "c");
    }
}
