package ru.job4j.streram;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CharsMethodTest {

    @Test
    public void symbols() {
        String input = "123";
        List<Character> except = List.of('1', '2', '3');
        assertEquals(except, CharsMethod.symbols(input));
    }
}