package ru.job4j.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeRowsTest {

    @Test
    public void merge() {
        int[][] result = {
                {8, 7, 6},
                {3, 2, 9},
                {5, 4, 1}
        };
        int[] excepted = {8, 7, 6, 3, 2, 9, 5, 4, 1};
        int[] out = MergeRows.merge(result);
        assertArrayEquals(excepted, out);
    }
}