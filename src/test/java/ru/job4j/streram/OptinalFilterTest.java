package ru.job4j.streram;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OptinalFilterTest {

    @Test
    public void defineChildren() {
        OptinalFilter.Child c1 = new OptinalFilter.Child("Bob", 11);
        OptinalFilter.Child c2 = new OptinalFilter.Child("James", 12);
        OptinalFilter.Child c3 = new OptinalFilter.Child("Dick", 16);
        OptinalFilter.Child c4 = new OptinalFilter.Child("Arthur", 12);

        OptinalFilter.Worker w1 = new OptinalFilter.Worker("1", List.of(c1, c2));
        OptinalFilter.Worker w2 = new OptinalFilter.Worker("2", List.of(c3));
        OptinalFilter.Worker w3 = new OptinalFilter.Worker("3", List.of(c4));
        assertEquals(List.of(w1), OptinalFilter.defineChildren(List.of(w1, w2,w3), "1").size());
    }
}