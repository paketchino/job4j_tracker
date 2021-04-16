package ru.job4j.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToUpperCaseTest {

    @Test
    public void toUpperCase() {
        char[] input = "alpha-123".toCharArray();
        char[] excepted = "ALPHA-123".toCharArray();
        assertArrayEquals(excepted, ToUpperCase.toUpperCase(input));
    }
}