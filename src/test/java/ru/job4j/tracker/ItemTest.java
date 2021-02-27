package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ItemTest {

    @Test
    public void sortByHigh() {
        Item item = new Item();
        List<Item> items = Arrays.asList(
                new Item("a"),
                new Item("b"),
                new Item("c")
        );
        List<Item> items2 = Arrays.asList(
                new Item("a"),
                new Item("b"),
                new Item("c")
        );
        Collections.sort(items, new Item());
        assertThat(item.compare(items.get(0), items2.get(0)), is(0));
        assertThat(item.compare(items.get(1), items2.get(1)), is(0));
        assertThat(item.compare(items.get(2), items2.get(2)), is(0));
    }

    @Test
    public void sortByLow() {
        Item item = new Item();
        List<Item> items = Arrays.asList(
                new Item("a"),
                new Item("b"),
                new Item("c")
        );
        List<Item> items2 = Arrays.asList(
                new Item("c"),
                new Item("b"),
                new Item("a")
        );
        Comparator c = Collections.reverseOrder(new Item());
        Collections.sort(items, c);
        assertThat(item.compare(items.get(0), items2.get(0)), is(0));
        assertThat(item.compare(items.get(1), items2.get(1)), is(0));
        assertThat(item.compare(items.get(2), items2.get(2)), is(0));
    }
}