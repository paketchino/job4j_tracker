package ru.job4j.streram;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class CollectToMapWhenDuplicateTest {

    @Test
    public void collect() {
        List<Integer> date = List.of(2, 3, 3);
        Map<Integer, Integer> ecxept = Map.of(
                2, 4,
                3, 9
        );
        Map<Integer, Integer> result = CollectToMapWhenDuplicate.collect(date.stream());
        assertEquals(ecxept, result);
    }
}