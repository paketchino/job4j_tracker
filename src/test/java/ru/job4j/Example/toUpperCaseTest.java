package ru.job4j.Example;

import org.junit.Test;

import static org.junit.Assert.*;

public class toUpperCaseTest {

    @Test
    public void toUpperCase() {
        char[] input = "alpha-123".toCharArray();
        char[] excepted = "ALPHA-123".toCharArray();
        assertArrayEquals(excepted, toUpperCase.toUpperCase(input));
    }
}