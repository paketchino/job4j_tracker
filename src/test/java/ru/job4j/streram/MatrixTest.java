package ru.job4j.streram;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void converter() {
        Matrix matrix = new Matrix();
        List<Integer> rsl = matrix.converter(new Integer[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                });
        List<Integer> excepted = List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        );
        assertThat(rsl, is(excepted));
    }
}