package ru.job4j.set;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class JackpotTest {
    @Test
    public void checkWin() {
        String[] strings = {"@", "@", "@", "@"};
        boolean win = Jackpot.checkYourWin(strings);
        assertThat(win, is(true));
    }

    @Test
    public void checkNotWin() {
        String[] strings = {"@", "@@", "@", "@"};
        boolean win = Jackpot.checkYourWin(strings);
        assertThat(win, is(false));
    }
}