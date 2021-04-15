package ru.job4j.Example;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class AbbreviationTest {

    @Test
    public void collect() {
        String s = "North Atlantic Treaty Organization";
        String rsl = Abbreviation.collect(s);
        assertThat(rsl, is("NATO"));
    }
}