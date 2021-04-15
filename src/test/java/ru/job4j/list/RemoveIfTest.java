package ru.job4j.list;

import org.junit.Test;

import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class RemoveIfTest {

    @Test
    public void checkRemoveIf() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        List<String> excepted = List.of("three", "seven", "eight");
        List<String> rsl = RemoveIf.sortList(list);
        assertThat(rsl, is(excepted));
    }
}