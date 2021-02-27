package ru.job4j.collection;
//
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class UniqueTextTest {

    @Test
    public void isEquals() {
        String origin = "My cat eats a mouse and milk";
        String duplicate = "My cat eats milk and a mouse";
        assertThat(UniqueText.isEquals(origin, duplicate), is(true));
    }

    @Test
    public void isNotEquals() {
        String origin = "My cat eats a mouse and milk";
        String duplicate = "Her dogs eat meat";
        assertThat(UniqueText.isEquals(origin, duplicate), is(false));
    }

    @Test
    public void isNotEquals2() {
        String origin = "My cat eats a mouse and milk";
        String duplicate = "My cat eats milk and a dog";
        assertThat(UniqueText.isEquals(origin, duplicate), is(false));
    }
}