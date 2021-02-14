package condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TranspositionTest {

    @Test
    public void whenSquare() {
        int [][] input = {
                {1, 2},
                {3, 4}
        };
        int [][] expect = {
                {1, 3},
                {2, 4}
        };
        assertArrayEquals(expect, Transposition.converter(input));
    }
}