package ru.job4j.samopoznanye;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class HammingTest {
    @Test
    public void checkStringsIs3() {
        int rsl = Hamming.checkString("2173896", "2233796");
        assertThat(rsl, is(3));
    }

    @Test
    public void checkStringsIs5() {
        int rsl = Hamming.checkString("abcde", "bcdef");
        assertThat(rsl, is(5));
    }

    @Test
    public void checkStringsIs0() {
        int rsl = Hamming.checkString("abcde", "abcde");
        assertThat(rsl, is(0));
    }
}