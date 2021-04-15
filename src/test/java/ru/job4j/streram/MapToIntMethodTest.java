package ru.job4j.streram;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MapToIntMethodTest {

    @Test
    public void sum() {
        assertEquals(294, MapToIntMethod.sum(List.of('a', 'b', 'c')));
    }

    @Test
    public void check() {
        assertEquals(
                15,
                MapToIntMethod.sum(new int[][]{
                        {1, 2, 3},
                        {4, 5}
                })
        );
    }
        @Test
        public void test() {
            assertEquals(
                    List.of(1, 2, 3, 4),
                    MapToIntMethod.flatMap(List.of(
                            List.of(1, 2),
                            List.of(3, 4)
                    ))
            );

    }
}