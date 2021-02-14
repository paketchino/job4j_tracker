package condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummingPreviousTest {

    @Test
    public void calculate() {

        assertArrayEquals(new int[]{1, 2, 3, 6}, SummingPrevious.calculate(1, 2, 4));
    }
}