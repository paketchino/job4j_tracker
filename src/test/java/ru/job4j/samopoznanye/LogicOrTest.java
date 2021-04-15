package ru.job4j.samopoznanye;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogicOrTest {
    @Test
    public void whenCheckLogicOr() {
        assertFalse(LogicOr.check(2));
        assertTrue(LogicOr.check(1));
        assertTrue(LogicOr.check(-2));
    }

}