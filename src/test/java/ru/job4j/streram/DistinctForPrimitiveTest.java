package ru.job4j.streram;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DistinctForPrimitiveTest {

    @Test
    public void collect() {
        assertEquals(List.of(1, 2), DistinctForPrimitive.collect(new int[]{1, 2, 1}));
    }
}