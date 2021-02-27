package ru.job4j.list;

import org.junit.Test;
import ru.job4j.CheckAhdGetter;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckAhdGetterTest {
    @Test
    public void whenCheckFirst() {
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        String result = CheckAhdGetter.getElement(list);
        String except = "First";
        assertThat(result, is(except));
    }
}