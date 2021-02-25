package ru.job4j.collection;

import ru.job4j.collection.*;
import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void sortNameByLow() {
        Comparator<Job> cmdName = new JobDescByNameLow();
        int rsl = cmdName.compare(
                new Job("Fix Gug", 1),
                new Job("Reload Comp", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void sortNameByHigh() {
        Comparator<Job> cmdName = new JobDescByNameHigh();
        int rsl = cmdName.compare(
                new Job("Fix Bug", 1),
                new Job("Reload Comp", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void sortByPriorityLow() {
        Comparator<Job> cmdName = new JobDescByPriorityLow();
        int rsl = cmdName.compare(
                new Job("Fix Bug", 1),
                new Job("Reload Comp", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void sortByPriorityHigh() {
        Comparator<Job> cmdName = new JobDescByPriorityHigh();
        int rsl = cmdName.compare(
                new Job("Fix Bug", 1),
                new Job("Reload Comp", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void sortByPriorityAndNameLow() {
        Comparator<Job> cmdName = new JobDescByNameLow().thenComparing(new JobDescByPriorityLow());
        int rsl = cmdName.compare(
                new Job("Fix Bug", 1),
                new Job("Reload Comp", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void sortByPriorityAndNameHigh() {
        Comparator<Job> cmdNam = new JobDescByPriorityHigh().thenComparing(new JobDescByNameHigh());
        int rsl = cmdNam.compare(
                new Job("Fix Bug", 1),
                new Job("Reload Comp", 2)
        );
        assertThat(rsl, lessThan(0));
    }
}