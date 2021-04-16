package ru.job4j.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModWithLoopTest {

    @Test
    public void number() {
        assertEquals(1, ModWithLoop.number(3, 2));
        assertEquals(0, ModWithLoop.number(4, 2));
    }
}