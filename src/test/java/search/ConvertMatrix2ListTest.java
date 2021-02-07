package search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ConvertMatrix2ListTest {

    @Test
    public void when2on2ArrayThenList() {
        ConvertMatrix2List convertMatrix2List = new ConvertMatrix2List();
        int[][] input = {
                {1, 2,},
                {3, 4}
        };
        List<Integer> expect = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = convertMatrix2List.toList(input);
        assertThat(result, is(expect));
    }
}