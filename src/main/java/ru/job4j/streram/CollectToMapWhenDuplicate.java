package ru.job4j.streram;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMapWhenDuplicate {
    public static Map<Integer, Integer> collect (Stream<Integer> data)
    {
        return data.collect(Collectors.toMap(k -> k, v -> v * v, (prev, curr) -> prev));
    }
}
