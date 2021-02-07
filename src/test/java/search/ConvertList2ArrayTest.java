package search;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list2Array = new ConvertList2Array();
        int[][] result = list2Array.toArray(
                Arrays.asList(1, 2, 3, 4, 5 , 6, 7),
                3);
        int[][] excepted = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(excepted));
    }
}