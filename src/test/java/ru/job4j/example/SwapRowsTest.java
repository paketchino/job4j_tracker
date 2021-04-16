package ru.job4j.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwapRowsTest {

    @Test
    public void swap() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6}
        };
        SwapRows.swap(data, 0, 1);
        assertArrayEquals(new int[][] {
                {4, 5, 6},
                {1, 2, 3}
                }, data
        );
    }

    @Test
    public void swap2() {
        int[][] data = {
                {4, 5, 6},
                {1, 2, 3}
        };
        SwapRows.swap(data, 0, 1);
        assertArrayEquals(new int[][] {
                {1, 2, 3},
                {4, 5, 6}
        }, data
        );
    }
}