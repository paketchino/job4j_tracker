package ru.job4j.streram;

import org.junit.Test;

import java.util.Objects;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class StreamOfMethodTest {
    @Test
    public void WhenUserStreamMethod() {
        assertEquals("abc", StreamOfMethod.createStream().map(o -> Objects.toString(o)).collect(Collectors.joining()));
    }

}