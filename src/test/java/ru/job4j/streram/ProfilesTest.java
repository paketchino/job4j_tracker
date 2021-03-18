package ru.job4j.streram;

import org.junit.Test;

import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ProfilesTest {
    @Test
    public void whenCreateList() {
        List<Address> addresses = List.of(
                new Address("Penza", "ul.DDDDD", 5, 3),
                new Address("Moscow", "ul.323212", 5, 3),
                new Address("Sankt-Peterburg", "ul.454454", 5, 3),
                new Address("DNO", "ul.544512", 5, 3),
                new Address("Russiz", "ul.98798", 5, 3)
        );
        Profile excepted = new Profile(   new Address("Moscow", "ul.323212", 5, 3));
        assertThat(addresses, is(excepted));
    }
}