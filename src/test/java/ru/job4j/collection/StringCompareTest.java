package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;


public class StringCompareTest {

    @Test
    public void whenStringAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Ivan",
                "Ivan"
        );
        assertThat(rsl, is(0));
    }
    @Test
    public void whenLeftLessThanRightResultShouldBeNegative () {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive () {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(rst, greaterThan(0));
    }
}