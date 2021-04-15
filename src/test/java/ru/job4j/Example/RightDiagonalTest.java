package ru.job4j.Example;

import org.junit.Test;

import static org.junit.Assert.*;

public class RightDiagonalTest {

    @Test
    public void diagonal() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] excepted = {3, 5, 7};
        assertArrayEquals(excepted, RightDiagonal.diagonal(data));
    }
}