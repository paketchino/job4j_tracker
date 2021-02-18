package ru.job4j.collection;

import org.junit.Test;

import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.greaterThan;

public class UserTest {

    @Test
    public void compareTo() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Roman", 20));
        users.add(new User("Roman", 21));
        Iterator<User> it = users.iterator();

        assertThat(it.next(), is(new User("Roman", 21)));
        assertThat(it.next(), is(new User("Roman", 20)));
    }


    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }
}