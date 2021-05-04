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
        Address address1 = new Address("Penza", "Zalenya", 10, 5);
        Address address2 = new Address("Sankt-Peterburg", "Konstatina", 323, 2);
        Address address3 = new Address("Moscow", "Talay", 445, 23);
        Address address4 = new Address("Moscow", "Talay", 445, 23);

        Profile profile1 = new Profile(address1);
        Profile profile2 = new Profile(address2);
        Profile profile3 = new Profile(address3);
        Profile profile4 = new Profile(address4);

        var profiles = Arrays.asList(profile1, profile2, profile3, profile4);
        var excepted = Arrays.asList(address3, address1, address2);
        Profiles profiles1 = new Profiles();
        var rsl = profiles1.collect(profiles);
        assertThat(rsl, is(excepted));
    }

}