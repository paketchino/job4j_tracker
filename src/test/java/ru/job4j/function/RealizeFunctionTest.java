package ru.job4j.function;
//
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RealizeFunctionTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = RealizeFunction.diapason(5, 8, x -> 2 * x + 1);
        List<Double> excepted = List.of(11D, 13D, 15D);
        assertThat(result, is(excepted));
    }

    @Test
    public void whenSquareFunctionThenSquareResult() {
        List<Double> result = RealizeFunction.diapason(5, 8, x -> x * x);
        List<Double> excepted = List.of(25D, 36D, 49D);
        assertThat(result, is(excepted));
    }

    @Test
    public void whenIndicative() {
        List<Double> result = RealizeFunction.diapason(5, 8, x -> Math.pow(x, 3));
        List<Double> excepted = List.of(125D, 216D, 343D);
        assertThat(result, is(excepted));
    }
}