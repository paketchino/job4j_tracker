package search;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> list = new LinkedList<>();
        list.add(new int[] {1});
        list.add(new int[] {2, 3});
        List<Integer> except = Arrays.asList(1, 2, 3);
        assertThat(ConvertList.convert(list), is(except));
    }

}