package ru.job4j.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SymmetryTest {

    @Test
    public void checkTrue() {
        assertEquals(true, Symmetry.check(1112111));
        assertEquals(false, Symmetry.check(112111));
    }
}