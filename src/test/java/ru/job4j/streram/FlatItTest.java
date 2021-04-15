package ru.job4j.streram;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FlatItTest {
    @Test
    public void whenIt() {
        Iterator<Iterator<Integer>> it = List.of(
                List.of(1).iterator(),
                List.of(2, 3).iterator()
        ).iterator();
        Assert.assertThat(
                FlatIt.flatten(it), Is.is(List.of(1, 2, 3))
        );
    }

}