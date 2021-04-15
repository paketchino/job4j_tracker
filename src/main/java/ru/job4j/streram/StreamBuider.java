package ru.job4j.streram;

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuider {
    public static Stream<Object> createStream(Integer[] data) {
        return Stream.builder().add(data.length - 2).add(data.length).build();
    }

    public static IntStream createStream(int start, int end) {
        return IntStream.rangeClosed(start, end);
    }

    public static List<Integer> collectList(Stream<Integer> data) {
        return data.collect(Collectors.toList());
    }

    public static Set<Integer> collectSet(Stream<Integer> data) {
        return data.collect(Collectors.toSet());
    }

    public static Map<Integer, Integer> collectMap(Stream<Integer> date) {
        return date.collect(Collectors.toMap(k -> k, v -> v * v));
    }
}
