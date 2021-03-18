package ru.job4j.streram;

import org.junit.Test;

import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ProfilesTest {
    @Test
    public void whenCreateList() {
        List<Profile> addresses = List.of(
                new Profile(new Address("Pebza", "Kolokolov", 3, 5)),
                new Profile(new Address("Moscow", "Brigadirov", 90, 32)),
                new Profile(new Address("Zarechnya", "Zelenya", 99, 23))
        );
        Profiles profiles = new Profiles();
        List<Profile> excepted = new ArrayList<>();
        excepted.add(new Profile(new Address("Pebza", "Kolokolov", 3, 5)));
        excepted.add(new Profile(new Address("Moscow", "Brigadirov", 90, 32)));
        excepted.add(new Profile(new Address("Zarechnya", "Zelenya", 99, 23)));
        assertThat(addresses, is(excepted));
    }
}