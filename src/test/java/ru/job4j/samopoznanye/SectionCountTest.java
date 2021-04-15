package ru.job4j.samopoznanye;

import org.junit.Test;

import static org.junit.Assert.*;

public class SectionCountTest {
    @Test
    public void test() {
        assertEquals(1, SectionCount.count(1, 1));
        assertEquals(2, SectionCount.count(2, 1));
        assertEquals(1, SectionCount.count(3, 2));
        assertEquals(2, SectionCount.count(4, 2));
    }
    @Test
    public void test1() {
        assertEquals(2, SectionCount.count(2, 1));
    }

}