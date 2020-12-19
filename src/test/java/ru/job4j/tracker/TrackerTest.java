package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        tracker.deleted(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}