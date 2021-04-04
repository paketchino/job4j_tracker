package ru.job4j.streram;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CollectorAriphmeticTest {
    @Test
    public void whenWithout0() {
        int out = CollectorAriphmetic.collect(List.of(1, 2, 3));
        assertEquals(out, 6);
    }

    @Test
    public void whenWith0() {
        int out = CollectorAriphmetic.collect(List.of(0, 2, 3));
        assertEquals(out, 0);
    }
}