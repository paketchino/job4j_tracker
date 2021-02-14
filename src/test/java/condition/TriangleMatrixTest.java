package condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleMatrixTest {

    @Test
    public void whenRowsEq2() {
        int[][] result = {
                {1}, {2, 3}, {4, 5, 6}
        };
        assertArrayEquals(result, TriangleMatrix.rows(3));
    }
}