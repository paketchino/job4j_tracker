package ru.job4j.streram;
//
import org.junit.Test;
import ru.job4j.collection.LexSort;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ProfilesTest {
    @Test
    public void whenCreateList() {
        var profile = new Profiles();
        var rsl = profile.collect(List.of(
                new Profile(new Address("Penza", "Zalenya", 10, 5)),
                new Profile(new Address("Moscow", "Talay", 445, 23)),
                new Profile(new Address("Sankt-Peterburg", "Konstatina", 323, 2))
        ));
        var excepted = profile.collect(List.of(
                new Profile(new Address("Penza", "Zalenya", 10, 5)),
                new Profile(new Address("Moscow", "Talay", 445, 23)),
                new Profile(new Address("Sankt-Peterburg", "Konstatina", 323, 2))
        ));
        assertThat(rsl, is(excepted));
    }

    @Test
    public void checkDuplicateList() {
        var profile = new Profiles();
        var rsl = profile.collect(List.of(
                new Profile(new Address("Penza", "Zalenya", 10, 5)),
                new Profile(new Address("Moscow", "Talay", 445, 23)),
                new Profile(new Address("Moscow", "Talay", 445, 23)),
                new Profile(new Address("Sankt-Peterburg", "Konstatina", 323, 2))
        ));
        var excepted = profile.collect(List.of(
                new Profile(new Address("Penza", "Zalenya", 10, 5)),
                new Profile(new Address("Sankt-Peterburg", "Konstatina", 323, 2)),
                new Profile(new Address("Moscow", "Talay", 445, 23)),
                new Profile(new Address("Moscow", "Talay", 445, 23))
                ));
        assertThat(rsl, is(excepted));
    }
}