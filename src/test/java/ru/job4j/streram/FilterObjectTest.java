package ru.job4j.streram;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FilterObjectTest {

    @Test
    public void filter() {
        List<FilterObject.User> u1 = List.of(
               new FilterObject.User("Bob", 20),
               new FilterObject.User("James", 29),
                new FilterObject.User("Boris", 15)
        );
        FilterObject.User user = FilterObject.filter(u1).iterator().next();
        assertEquals("Bob", user.getName());
        assertEquals(20, user.getAge());
    }

}