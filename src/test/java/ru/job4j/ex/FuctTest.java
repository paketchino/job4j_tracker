package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FuctTest {

    @Test(expected = IllegalArgumentException.class)
    public void fact() {
        Fuct.fact(0);
    }
}