package ru.job4j.Example;

import org.junit.Test;

import static org.junit.Assert.*;

public class modWithLoopTest {

    @Test
    public void number() {
        assertEquals(1, modWithLoop.number(3, 2));
        assertEquals(0, modWithLoop.number(4, 2));
    }
}