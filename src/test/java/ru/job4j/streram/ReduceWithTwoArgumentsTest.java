package ru.job4j.streram;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ReduceWithTwoArgumentsTest {

    @Test
    public void test() {
        assertEquals(Integer.valueOf(10), ReduceWithTwoArguments.collect(List.of(1, 2)));
        assertEquals(Integer.valueOf(20), ReduceWithTwoArguments.collect(List.of(1, 2, 2)));
    }
}