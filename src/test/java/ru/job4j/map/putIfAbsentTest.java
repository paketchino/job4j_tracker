package ru.job4j.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import ru.job4j.map.putIfAbsent.User;


public class putIfAbsentTest {
    @Test
    public void addNewElement() {
        Map<Integer, putIfAbsent.User> map = new HashMap<>(
                Map.of(
                        1, new User(1, "Name1"),
                        2, new User(2, "Name2")
                )
        );
        putIfAbsent put = new putIfAbsent(map);
        User user = new User(1, "Name3");
        boolean rsl = put.addNewElement(user);
        assertThat(rsl, is(false));
    }

    @Test
    public void addNewElementTrue() {
        Map<Integer, User> map = new HashMap<>(
                Map.of(
                        1, new User(1, "Name1"),
                        2, new User(2, "Name2")
                )
        );
        putIfAbsent put = new putIfAbsent(map);
        User user = new User(3, "Name3");
        boolean rsl = put.addNewElement(user);
        assertThat(rsl, is(true));
    }
}