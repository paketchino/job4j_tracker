package ru.job4j.streram;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LimitMethodTest {

    @Test
    public void firstThree() {
        assertEquals(
                List.of("A", "B", "C"),
                LimitMethod.firstThree(List.of("A","B","C", "D","E"))
        );
    }

    @Test
    public void lastThree()
    {
        assertEquals(List.of("C", "D", "E"),
                LimitMethod.lastThree(List.of("A","B","C", "D","E")));
    }
}