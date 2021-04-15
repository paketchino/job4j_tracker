package ru.job4j.Example;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TwoSquareArraysTest {

    @Test
    public void collectArray() {
        int [][] left = {
                {1, 10, 55}, {2, 15, 20}, {30, 45, 25}
        };
        int [][] right = {
                {2, 55, 14}, {7, 8, 21}, {90, 60 ,82}
        };
        int[] excepted = TwoSquareArrays.collectArray(left, right);
        int[] rsl = {2, 55, 55, 7, 15, 21, 90, 60, 82};
        assertThat(rsl, is(excepted));
    }
}