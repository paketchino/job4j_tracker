package ru.job4j.Example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxLengthSeriaTest {

    @Test
    public void find() {
        assertEquals(3,
                MaxLengthSeria.find(new int[] {1, 2, 3})
        );
    }

    @Test
    public void test1()
    {
        assertEquals(1,
                MaxLengthSeria.find(new int[] {1})
        );
    }

    @Test
    public void test2()
    {
        assertEquals(1,
                MaxLengthSeria.find(new int[] {2, 1})
        );
    }
    @Test
    public void test3()
    {
        assertEquals(4,
                MaxLengthSeria.find(new int[] {1, 2, 0, 1, 2, 3})
        );
    }

    @Test
    public void test5()
    {
        assertEquals(4,
                MaxLengthSeria.find(new int[] {1, 2, 1, 1, 2, 3})
        );
    }
    @Test
    public void test6()
    {
        assertEquals(1,
                MaxLengthSeria.find(new int[] {3, 2, 1})
        );
    }
}