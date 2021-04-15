package ru.job4j.streram;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DistinctForObjectTest {

    @Test
    public void collect() {
        DistinctForObject.User u1 = new DistinctForObject.User("Bob", 20);
        DistinctForObject.User u2 = new DistinctForObject.User("Bob", 20);
        DistinctForObject.User u3 = new DistinctForObject.User("John", 25);

        assertEquals(List.of(u1, u3), DistinctForObject.collect(List.of(
                u1, u2, u3))
        );
    }
}