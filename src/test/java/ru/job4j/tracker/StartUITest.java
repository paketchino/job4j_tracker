package ru.job4j.tracker;

import org.junit.Test;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.nullValue;

public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenNeedDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("delete Item");
        tracker.add(item);
        String[] answer = {String.valueOf(item.getId()),
                "delete Item"
        };
        Input input = new StubInput(answer);
        StartUI.deleteItem(input, tracker);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
    @Test
    public void whenNeedReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new Item");
        tracker.add(item);
        String [] answer = {
                String.valueOf(item.getId()),
                "replaced Item"
        };
        StartUI.replaceItem(new StubInput(answer), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced Item"));
    }

}