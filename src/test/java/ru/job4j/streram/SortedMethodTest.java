package ru.job4j.streram;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SortedMethodTest {

    @Test
    public void sorted() {
        assertEquals(List.of("a", "b", "c"), SortedMethod.sorted(List.of("c", "b", "a")));
    }

    @Test
    public void reverseSorted()
    {
        assertEquals(List.of("c", "b", "a"), SortedMethod.sortedReverse(List.of("a", "b", "c")));
    }
}