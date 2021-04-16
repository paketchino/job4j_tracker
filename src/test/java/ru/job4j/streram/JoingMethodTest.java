package ru.job4j.streram;

import org.junit.Test;

import java.util.List;
import java.util.StringJoiner;

import static org.junit.Assert.*;

public class JoingMethodTest {

    @Test
    public void join() {
        StringJoiner expect = new StringJoiner(System.lineSeparator(),
                "Prefix",
                "Suffix"
        );
        expect.add("A");
        expect.add("B");
        expect.add("C");
        assertEquals(expect.toString(), JoingMethod.join(
                List.of(
                        "A", "B", "C"
                ))
        );
    }
}