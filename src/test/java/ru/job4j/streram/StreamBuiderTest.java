package ru.job4j.streram;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamBuiderTest {
    @Test
    public void test() {
        Integer[] data = {1, 2, 3};
        Stream<Object> stream = StreamBuider.createStream(data);
        List<Integer> list = stream.map(v -> (Integer) v).collect(Collectors.toList());
        List<Integer> excepted = List.of(1, 3);
        assertEquals(excepted, list);
    }

    @Test
    public void test2() {
        List<Integer> result = StreamBuider.createStream(1, 3).boxed().collect(Collectors.toList());
        List<Integer> except = List.of(1, 2, 3);
        assertEquals(except, result);
    }

    @Test
    public void test3() {
        Set<Integer> input = Set.of(1, 2);
        Set<Integer> except = Set.of(1, 2);
        assertEquals(except, StreamBuider.collectSet(input.stream()));
    }

    @Test
    public void test4() {
        List<Integer> data = List.of(2, 3);
        Map<Integer, Integer> except = Map.of(
                2, 4,
                3, 9
        );
        Map<Integer, Integer> result = StreamBuider.collectMap(data.stream());
        assertEquals(except, result);
    }
}