package ru.job4j.streram;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MinMethodTest {

    @Test
    public void checkMin() {
        assertEquals("ab", MinMethod.min(List.of("astr", "ab", "abc")));
    }
}