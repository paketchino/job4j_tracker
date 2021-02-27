package ru.job4j.collection;

import ru.job4j.collection.*;
import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void sortNameByDecrease() {
        Comparator<Job> cmdName = new JobDescByName();
        int rsl = cmdName.compare(
                new Job("Fix Gug", 1),
                new Job("Reload Comp", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void sortNameByIncrease() {
        Comparator<Job> cmdName = new JobAscByName();
        int rsl = cmdName.compare(
                new Job("Fix Bug", 1),
                new Job("Reload Comp", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void sortPriorityByIncrease() {
        Comparator<Job> cmdName = new JobAscByPriority();
        int rsl = cmdName.compare(
                new Job("Fix Bug", 1),
                new Job("Reload Comp", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void sortPriorityByDecrease() {
        Comparator<Job> cmdName = new JobDescByPriority();
        int rsl = cmdName.compare(
                new Job("Fix Bug", 1),
                new Job("Fix Bug", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void sortByPriorityAndNameIncrease() {
        Comparator<Job> cmdNam = new JobAscByPriority().thenComparing(new JobAscByName());
        int rsl = cmdNam.compare(
                new Job("Fix Bug", 1),
                new Job("Reload Comp", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void sortByPriorityAndNameDecrease() {
        Comparator<Job> cmdName = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmdName.compare(
                new Job("Fix Bug", 1),
                new Job("Fix Bug", 2)
        );
        assertThat(rsl, greaterThan(0));
    }
}