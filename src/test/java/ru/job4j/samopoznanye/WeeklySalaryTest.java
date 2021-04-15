package ru.job4j.samopoznanye;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
public class WeeklySalaryTest {
    @Test
    public void calculate400() {
        int[] hours = {8, 8, 8, 8, 8, 0, 0};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(400));
    }

    @Test
    public void calculate410() {
        int[] hours = {10, 10, 10, 0, 8, 0, 0};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(410));
    }

    @Test
    public void calculate560() {
        int[] hours = {0, 0, 0, 0, 0, 12, 12};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(560));
    }

    @Test
    public void calculate900() {
        int[] hours = {8, 10, 8, 10, 8, 12, 8};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(900));
    }
}