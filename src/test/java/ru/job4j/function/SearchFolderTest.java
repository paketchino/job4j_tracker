package ru.job4j.function;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SearchFolderTest {
    @Test
    public void whenFilterSize() {
        List<Folder> list = List.of(
                new Folder("fix", 110),
                new Folder("bug", 50),
                new Folder("bug", 99)
        );
        List<Folder> excepted = List.of(
                new Folder("fix", 110)
        );
        Predicate<Folder> predicate = f -> f.getSize() > 100;
        List<Folder> rsl = SearchFolder.filter(list, predicate);
        assertThat(rsl, is(excepted));
    }

    @Test
    public void whenFilterName() {
        List<Folder> list = List.of(
                new Folder("fix", 110),
                new Folder("bug", 50),
                new Folder("bug", 99)
        );
        List<Folder> excepted = List.of(
                new Folder("bug", 50),
                new Folder("bug", 99)
        );
        Predicate<Folder> predicate = f -> f.getName().contains("bug");
        List<Folder> rsl = SearchFolder.filter(list, predicate);
        assertThat(rsl, is(excepted));
    }
}