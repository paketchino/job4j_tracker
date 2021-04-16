package ru.job4j.example;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class IndezOfWithCountTest {

    @Test
    public void indexOf() {
        assertEquals(3, IndezOfWithCount.indexOf(new char[] {'a', 'b', 'c', 'd'}, 'd', 1));
        assertEquals(5, IndezOfWithCount.indexOf(new char[]{'a', 'b', 'c', 'd', 'a', 'd'}, 'd', 2));
    }
}