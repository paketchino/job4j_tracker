package ru.job4j.streram;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class FindFirstMethodTest {

    @Test
    public void first() {
        assertEquals(Optional.empty(), FindFirstMethod.first(List.of()));
        assertEquals(Optional.of(1), FindFirstMethod.first(List.of(1)));
    }

    @Test
    public void map() {
        List<Integer> input = List.of(1, 2, 3);
        List<Integer> except = List.of(1, 4, 9);
        assertEquals(except, FindFirstMethod.map(input));
    }

    @Test
    public void mapString() {
        List<String> input = List.of("One", "Two");
        List<String> except = List.of("One.java", "Two.java");
        assertEquals(except, FindFirstMethod.mapString(input));
    }
}