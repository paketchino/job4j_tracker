package ru.job4j.streram;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TakeWhileMethodTest {

    @Test
    public void takeWhile() {
        assertEquals(List.of(-3, -2, -1), TakeWhileMethod.takeWhile(List.of(1, 2, 3, -1, -2, -3)));
    }

    @Test
    public void dropWhile() {
        assertEquals(List.of(1, 2, 3), TakeWhileMethod.dropWhile(List.of(3, 2, 1, -1, -2, -3)));
    }
}