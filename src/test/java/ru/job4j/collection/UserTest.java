package ru.job4j.collection;

import org.junit.Test;

import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.greaterThan;

public class UserTest {

    @Test
    public void compareTo() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Roman", 20));
        users.add(new User("Roman1", 21));
        Iterator<User> it = users.iterator();

        assertThat(it.next(), is(new User("Roman", 20)));
        assertThat(it.next(), is(new User("Roman1", 21)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareRomanVSRetr() {
        int rsl = new User("Roman", 30)
                .compareTo(
                        new User("Retr", 20)
                );
        assertThat(rsl, greaterThan(0));
    }
    }