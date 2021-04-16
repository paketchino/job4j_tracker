package ru.job4j.streram;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.*;

public class TerminalMethodTest {
    @Test
    public void test() {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);
        System.setOut(out);
        TerminalMethod.show(List.of(1, 2, 3).stream());
        String nl = System.lineSeparator();
        String expect = "1" + nl + "2" + nl + "3" + nl;
        assertEquals(expect, buffer.toString());
    }

    @Test
    public void check() {
        assertTrue(TerminalMethod.check(List.of("1234", "abcd")));
        assertFalse(TerminalMethod.check(List.of("1234", "ab")));
    }

    @Test
    public void checkAnyMatch() {
        assertTrue(TerminalMethod.checkAnyMath(List.of("job4j", "academy")));
        assertFalse(TerminalMethod.checkAnyMath(List.of("academy", "academy")));
    }
}